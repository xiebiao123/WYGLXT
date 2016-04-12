package com.xiaoqu.wygl.estate.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.xiaoqu.wygl.estate.dao.EstateDao;
import com.xiaoqu.wygl.estate.dto.Estate;
import com.xiaoqu.wygl.estate.dto.EstateCondition;
import com.xiaoqu.wygl.estate.service.EstateService;

/**
 * 小区信息ServiceImpl
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 下午2:09:48
 *
 */
@Service
public class EstateServiceImpl implements EstateService{

	@Resource
	private EstateDao estateDao;
	
	public Integer add(Estate po) {
		return estateDao.add(po);
	}
	
	public int delete(Integer id) {
		return estateDao.delete(id);
	}
	
	public int update(Estate po) {
		return estateDao.update(po);
	}
	
	public Estate findById(Integer id) {
		return estateDao.findById(id);
	}
	
	public List<Estate> findPageByCondition(EstateCondition pc) {
		return estateDao.findPageByCondition(pc);
	}
	
	public Integer countByCondition(EstateCondition pc) {
		return estateDao.countByCondition(pc);
	}
}
