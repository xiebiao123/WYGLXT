package com.xiaoqu.wygl.room.service;

import java.util.List;

import com.xiaoqu.wygl.room.dto.Room;
import com.xiaoqu.wygl.room.dto.RoomCondition;

/**
 * 房间信息Service
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 下午2:08:06
 *
 */
public interface RoomService {

	/**
	 * 新增房间信息
	 */
	public Integer add(Room po);
	/**
	 * 删除房间信息
	 */
	public int delete(Integer id);
	/**
	 * 修改房间信息
	 */
	public int update(Room po);
	/**
	 * 根据id获取房间信息
	 */
	public Room findById(Integer id);
	/**
	 * 分页查询房间信息
	 */
	public List<Room> findPageByCondition(RoomCondition pc);
	
	/**
	 * 统计查询数据的条数
	 */
	public Integer countByCondition(RoomCondition pc);
	
}
