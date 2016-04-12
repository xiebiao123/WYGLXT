package com.xiaoqu.wygl.stall.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.xiaoqu.wygl.stall.dao.StallDao;
import com.xiaoqu.wygl.stall.dto.Stall;
import com.xiaoqu.wygl.stall.dto.StallCondition;
import com.xiaoqu.wygl.stall.service.StallService;

/**
 * 车位信息ServiceImpl
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 下午2:09:48
 *
 */
@Service
public class StallServiceImpl implements StallService{

	@Resource
	private StallDao stallDao;
	
	public Integer add(Stall po) {
		return stallDao.add(po);
	}
	
	public int delete(Integer id) {
		return stallDao.delete(id);
	}
	
	public int update(Stall po) {
		return stallDao.update(po);
	}
	
	public Stall findById(Integer id) {
		return stallDao.findById(id);
	}
	
	public List<Stall> findPageByCondition(StallCondition pc) {
		return stallDao.findPageByCondition(pc);
	}
	
	public Integer countByCondition(StallCondition pc) {
		return stallDao.countByCondition(pc);
	}
}
