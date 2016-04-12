package com.xiaoqu.wygl.room.controller;

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

import com.xiaoqu.wygl.room.dto.Room;
import com.xiaoqu.wygl.room.dto.RoomCondition;
import com.xiaoqu.wygl.room.service.RoomService;
import com.xiaoqu.wygl.enums.CommStatusEnum;
import com.xiaoqu.wygl.enums.CommErrorEnum;
import com.xiaoqu.wygl.util.MyResponse;

/**
 * 房间信息controller
 * @author xieb
 * @version 1.00
 * 2016/04/12
 */
@Controller
@RequestMapping(value = "room")
public class RoomController extends BaseController{

    private final Logger logger = Logger.getLogger(RoomController.class);
	
	@Resource
	private RoomService roomService;
	
	/**
	 *通过id查找房间信息
	 */
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public MyResponse<Room> findCityById(@PathVariable Integer id) {
		MyResponse<Room> response = new MyResponse<Room>();
		try {
			Room room= roomService.findById(id);
			response.setData(room);
			logger.info(room);
			response.setStatusResponse(CommStatusEnum.FIND);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}

	/**
	 *添加房间信息
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public MyResponse<Void> addCity(@Valid @RequestBody Room room) {
		MyResponse<Void> response = new MyResponse<Void>();
		try {
			Integer id = roomService.add(room);
			logger.info(id);
			response.setStatusResponse(CommStatusEnum.ADD);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}

	/**
	 *删除房间信息
	 */
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public MyResponse<Void> deleteCity(@PathVariable Integer id) {
		MyResponse<Void> response = new MyResponse<Void>();
		try {
			int count = roomService.delete(id);
			logger.info(count);
			response.setStatusResponse(CommStatusEnum.DELETE);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}

	/**
	 *修改房间信息
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT)
	public MyResponse<Void> updateCity(@Valid @RequestBody Room room) {
		MyResponse<Void> response = new MyResponse<Void>();
		try {
			int count = roomService.update(room);
			logger.info(count);
			response.setStatusResponse(CommStatusEnum.UPDATE);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}

	/**
	 *通过条件分页查询房间信息
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public MyResponse<List<Room>> findCityPageByCondition(RoomCondition condition) {
		MyResponse<List<Room>> response = new MyResponse<List<Room>>();
		try {
			/*初始化分页查询*/
			if(condition.getPageSize()>0){
				condition.init();
			}
			int count =  roomService.countByCondition(condition);
			if(count==0){
				response.setStatusResponse(CommStatusEnum.NOFIND);
				return response;
			}
			response.setToken(count);
			List<Room> roomList = roomService.findPageByCondition(condition);
			logger.info(roomList);
			response.setData(roomList);
			response.setStatusResponse(CommStatusEnum.FIND);
		} catch (Throwable t) {
			logger.error("系统错误", t);
			response.setErrorResponse(CommErrorEnum.Err03);
		}
		return response;
	}
}
