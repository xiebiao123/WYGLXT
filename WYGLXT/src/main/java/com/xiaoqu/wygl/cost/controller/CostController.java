package com.xiaoqu.wygl.cost.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xiaoqu.wygl.base.BaseController;

import com.xiaoqu.wygl.cost.dto.Cost;
import com.xiaoqu.wygl.cost.dto.CostCondition;
import com.xiaoqu.wygl.cost.service.CostService;
import com.xiaoqu.wygl.enums.CommStatusEnum;
import com.xiaoqu.wygl.enums.CommErrorEnum;
import com.xiaoqu.wygl.util.MyResponse;

/**
 * 收费详细controller
 * @author xieb
 * @version 1.00
 * 2016/04/12
 */
@Controller
@RequestMapping(value = "cost")
public class CostController extends BaseController{

    private final Logger logger = Logger.getLogger(CostController.class);
	
	@Resource
	private CostService costService;
	
	/**
	 *通过id查找收费详细
	 */
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public MyResponse<Cost> findCityById(@PathVariable Integer id) {
		MyResponse<Cost> response = new MyResponse<Cost>();
		try {
			Cost cost= costService.findById(id);
			response.setData(cost);
			logger.info(cost);
			response.setStatusResponse(CommStatusEnum.FIND);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}

	/**
	 *添加收费详细
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public MyResponse<Void> addCity(@Valid @RequestBody Cost cost) {
		MyResponse<Void> response = new MyResponse<Void>();
		try {
			Integer id = costService.add(cost);
			logger.info(id);
			response.setStatusResponse(CommStatusEnum.ADD);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}

	/**
	 *删除收费详细
	 */
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public MyResponse<Void> deleteCity(@PathVariable Integer id) {
		MyResponse<Void> response = new MyResponse<Void>();
		try {
			int count = costService.delete(id);
			logger.info(count);
			response.setStatusResponse(CommStatusEnum.DELETE);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}

	/**
	 *修改收费详细
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT)
	public MyResponse<Void> updateCity(@Valid @RequestBody Cost cost) {
		MyResponse<Void> response = new MyResponse<Void>();
		try {
			int count = costService.update(cost);
			logger.info(count);
			response.setStatusResponse(CommStatusEnum.UPDATE);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}

	/**
	 *通过条件分页查询收费详细
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public MyResponse<List<Cost>> findCityPageByCondition(CostCondition condition) {
		MyResponse<List<Cost>> response = new MyResponse<List<Cost>>();
		try {
			/*初始化分页查询*/
			if(condition.getPageSize()>0){
				condition.init();
			}
			int count =  costService.countByCondition(condition);
			if(count==0){
				response.setStatusResponse(CommStatusEnum.NOFIND);
				return response;
			}
			response.setToken(count);
			List<Cost> costList = costService.findPageByCondition(condition);
			logger.info(costList);
			response.setData(costList);
			response.setStatusResponse(CommStatusEnum.FIND);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}
}
