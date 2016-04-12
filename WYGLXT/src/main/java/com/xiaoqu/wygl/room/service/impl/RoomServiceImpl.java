package com.xiaoqu.wygl.room.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.xiaoqu.wygl.room.dao.RoomDao;
import com.xiaoqu.wygl.room.dto.Room;
import com.xiaoqu.wygl.room.dto.RoomCondition;
import com.xiaoqu.wygl.room.service.RoomService;

/**
 * 房间信息ServiceImpl
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 下午2:09:48
 *
 */
@Service
public class RoomServiceImpl implements RoomService{

	@Resource
	private RoomDao roomDao;
	
	public Integer add(Room po) {
		return roomDao.add(po);
	}
	
	public int delete(Integer id) {
		return roomDao.delete(id);
	}
	
	public int update(Room po) {
		return roomDao.update(po);
	}
	
	public Room findById(Integer id) {
		return roomDao.findById(id);
	}
	
	public List<Room> findPageByCondition(RoomCondition pc) {
		return roomDao.findPageByCondition(pc);
	}
	
	public Integer countByCondition(RoomCondition pc) {
		return roomDao.countByCondition(pc);
	}
}
