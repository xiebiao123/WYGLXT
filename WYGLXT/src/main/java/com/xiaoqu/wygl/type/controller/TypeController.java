package com.xiaoqu.wygl.type.controller;

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

import com.xiaoqu.wygl.type.dto.Type;
import com.xiaoqu.wygl.type.dto.TypeCondition;
import com.xiaoqu.wygl.type.service.TypeService;
import com.xiaoqu.wygl.enums.CommStatusEnum;
import com.xiaoqu.wygl.enums.CommErrorEnum;
import com.xiaoqu.wygl.util.MyResponse;

/**
 * 收费标准controller
 * @author xieb
 * @version 1.00
 * 2016/04/12
 */
@Controller
@RequestMapping(value = "type")
public class TypeController extends BaseController{

    private final Logger logger = Logger.getLogger(TypeController.class);
	
	@Resource
	private TypeService typeService;
	
	/**
	 *通过id查找收费标准
	 */
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public MyResponse<Type> findCityById(@PathVariable Integer id) {
		MyResponse<Type> response = new MyResponse<Type>();
		try {
			Type type= typeService.findById(id);
			response.setData(type);
			logger.info(type);
			response.setStatusResponse(CommStatusEnum.FIND);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}

	/**
	 *添加收费标准
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public MyResponse<Void> addCity(@Valid @RequestBody Type type) {
		MyResponse<Void> response = new MyResponse<Void>();
		try {
			Integer id = typeService.add(type);
			logger.info(id);
			response.setStatusResponse(CommStatusEnum.ADD);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}

	/**
	 *删除收费标准
	 */
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public MyResponse<Void> deleteCity(@PathVariable Integer id) {
		MyResponse<Void> response = new MyResponse<Void>();
		try {
			int count = typeService.delete(id);
			logger.info(count);
			response.setStatusResponse(CommStatusEnum.DELETE);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}

	/**
	 *修改收费标准
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT)
	public MyResponse<Void> updateCity(@Valid @RequestBody Type type) {
		MyResponse<Void> response = new MyResponse<Void>();
		try {
			int count = typeService.update(type);
			logger.info(count);
			response.setStatusResponse(CommStatusEnum.UPDATE);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}

	/**
	 *通过条件分页查询收费标准
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public MyResponse<List<Type>> findCityPageByCondition(TypeCondition condition) {
		MyResponse<List<Type>> response = new MyResponse<List<Type>>();
		try {
			/*初始化分页查询*/
			if(condition.getPageSize()>0){
				condition.init();
			}
			int count =  typeService.countByCondition(condition);
			if(count==0){
				response.setStatusResponse(CommStatusEnum.NOFIND);
				return response;
			}
			response.setToken(count);
			List<Type> typeList = typeService.findPageByCondition(condition);
			logger.info(typeList);
			response.setData(typeList);
			response.setStatusResponse(CommStatusEnum.FIND);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}
}
