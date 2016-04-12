package com.xiaoqu.wygl.admin.controller;

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

import com.xiaoqu.wygl.admin.dto.Admin;
import com.xiaoqu.wygl.admin.dto.AdminCondition;
import com.xiaoqu.wygl.admin.service.AdminService;
import com.xiaoqu.wygl.enums.CommStatusEnum;
import com.xiaoqu.wygl.enums.CommErrorEnum;
import com.xiaoqu.wygl.util.MyResponse;

/**
 * 系统管理员controller
 * @author xieb
 * @version 1.00
 * 2016/04/12
 */
@Controller
@RequestMapping(value = "admin")
public class AdminController extends BaseController{

    private final Logger logger = Logger.getLogger(AdminController.class);
	
	@Resource
	private AdminService adminService;
	
	/**
	 *通过id查找系统管理员
	 */
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public MyResponse<Admin> findCityById(@PathVariable Integer id) {
		MyResponse<Admin> response = new MyResponse<Admin>();
		try {
			Admin admin= adminService.findById(id);
			response.setData(admin);
			logger.info(admin);
			response.setStatusResponse(CommStatusEnum.FIND);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}

	/**
	 *添加系统管理员
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public MyResponse<Void> addCity(@Valid @RequestBody Admin admin) {
		MyResponse<Void> response = new MyResponse<Void>();
		try {
			Integer id = adminService.add(admin);
			logger.info(id);
			response.setStatusResponse(CommStatusEnum.ADD);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}

	/**
	 *删除系统管理员
	 */
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public MyResponse<Void> deleteCity(@PathVariable Integer id) {
		MyResponse<Void> response = new MyResponse<Void>();
		try {
			int count = adminService.delete(id);
			logger.info(count);
			response.setStatusResponse(CommStatusEnum.DELETE);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}

	/**
	 *修改系统管理员
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT)
	public MyResponse<Void> updateCity(@Valid @RequestBody Admin admin) {
		MyResponse<Void> response = new MyResponse<Void>();
		try {
			int count = adminService.update(admin);
			logger.info(count);
			response.setStatusResponse(CommStatusEnum.UPDATE);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}

	/**
	 *通过条件分页查询系统管理员
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public MyResponse<List<Admin>> findCityPageByCondition(AdminCondition condition) {
		MyResponse<List<Admin>> response = new MyResponse<List<Admin>>();
		try {
			/*初始化分页查询*/
			if(condition.getPageSize()>0){
				condition.init();
			}
			int count =  adminService.countByCondition(condition);
			if(count==0){
				response.setStatusResponse(CommStatusEnum.NOFIND);
				return response;
			}
			response.setToken(count);
			List<Admin> adminList = adminService.findPageByCondition(condition);
			logger.info(adminList);
			response.setData(adminList);
			response.setStatusResponse(CommStatusEnum.FIND);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}
}
