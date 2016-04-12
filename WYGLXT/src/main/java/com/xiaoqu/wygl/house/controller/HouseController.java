package com.xiaoqu.wygl.house.controller;

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

import com.xiaoqu.wygl.house.dto.House;
import com.xiaoqu.wygl.house.dto.HouseCondition;
import com.xiaoqu.wygl.house.service.HouseService;
import com.xiaoqu.wygl.enums.CommStatusEnum;
import com.xiaoqu.wygl.enums.CommErrorEnum;
import com.xiaoqu.wygl.util.MyResponse;

/**
 * 单元楼信息controller
 * @author xieb
 * @version 1.00
 * 2016/04/12
 */
@Controller
@RequestMapping(value = "house")
public class HouseController extends BaseController{

    private final Logger logger = Logger.getLogger(HouseController.class);
	
	@Resource
	private HouseService houseService;
	
	/**
	 *通过id查找单元楼信息
	 */
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public MyResponse<House> findCityById(@PathVariable Integer id) {
		MyResponse<House> response = new MyResponse<House>();
		try {
			House house= houseService.findById(id);
			response.setData(house);
			logger.info(house);
			response.setStatusResponse(CommStatusEnum.FIND);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}

	/**
	 *添加单元楼信息
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public MyResponse<Void> addCity(@Valid @RequestBody House house) {
		MyResponse<Void> response = new MyResponse<Void>();
		try {
			Integer id = houseService.add(house);
			logger.info(id);
			response.setStatusResponse(CommStatusEnum.ADD);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}

	/**
	 *删除单元楼信息
	 */
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public MyResponse<Void> deleteCity(@PathVariable Integer id) {
		MyResponse<Void> response = new MyResponse<Void>();
		try {
			int count = houseService.delete(id);
			logger.info(count);
			response.setStatusResponse(CommStatusEnum.DELETE);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}

	/**
	 *修改单元楼信息
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT)
	public MyResponse<Void> updateCity(@Valid @RequestBody House house) {
		MyResponse<Void> response = new MyResponse<Void>();
		try {
			int count = houseService.update(house);
			logger.info(count);
			response.setStatusResponse(CommStatusEnum.UPDATE);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}

	/**
	 *通过条件分页查询单元楼信息
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public MyResponse<List<House>> findCityPageByCondition(HouseCondition condition) {
		MyResponse<List<House>> response = new MyResponse<List<House>>();
		try {
			/*初始化分页查询*/
			if(condition.getPageSize()>0){
				condition.init();
			}
			int count =  houseService.countByCondition(condition);
			if(count==0){
				response.setStatusResponse(CommStatusEnum.NOFIND);
				return response;
			}
			response.setToken(count);
			List<House> houseList = houseService.findPageByCondition(condition);
			logger.info(houseList);
			response.setData(houseList);
			response.setStatusResponse(CommStatusEnum.FIND);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}
}
