package com.xiaoqu.wygl.cost.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.xiaoqu.wygl.cost.dao.CostDao;
import com.xiaoqu.wygl.cost.dto.Cost;
import com.xiaoqu.wygl.cost.dto.CostCondition;
import com.xiaoqu.wygl.cost.service.CostService;

/**
 * 收费详细ServiceImpl
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 下午2:09:48
 *
 */
@Service
public class CostServiceImpl implements CostService{

	@Resource
	private CostDao costDao;
	
	public Integer add(Cost po) {
		return costDao.add(po);
	}
	
	public int delete(Integer id) {
		return costDao.delete(id);
	}
	
	public int update(Cost po) {
		return costDao.update(po);
	}
	
	public Cost findById(Integer id) {
		return costDao.findById(id);
	}
	
	public List<Cost> findPageByCondition(CostCondition pc) {
		return costDao.findPageByCondition(pc);
	}
	
	public Integer countByCondition(CostCondition pc) {
		return costDao.countByCondition(pc);
	}
}
