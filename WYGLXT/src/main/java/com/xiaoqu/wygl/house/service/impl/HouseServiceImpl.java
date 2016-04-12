package com.xiaoqu.wygl.house.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.xiaoqu.wygl.house.dao.HouseDao;
import com.xiaoqu.wygl.house.dto.House;
import com.xiaoqu.wygl.house.dto.HouseCondition;
import com.xiaoqu.wygl.house.service.HouseService;

/**
 * 单元楼信息ServiceImpl
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 下午2:09:48
 *
 */
@Service
public class HouseServiceImpl implements HouseService{

	@Resource
	private HouseDao houseDao;
	
	public Integer add(House po) {
		return houseDao.add(po);
	}
	
	public int delete(Integer id) {
		return houseDao.delete(id);
	}
	
	public int update(House po) {
		return houseDao.update(po);
	}
	
	public House findById(Integer id) {
		return houseDao.findById(id);
	}
	
	public List<House> findPageByCondition(HouseCondition pc) {
		return houseDao.findPageByCondition(pc);
	}
	
	public Integer countByCondition(HouseCondition pc) {
		return houseDao.countByCondition(pc);
	}
}
