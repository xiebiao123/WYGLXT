package com.xiaoqu.wygl.complain.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.xiaoqu.wygl.complain.dao.ComplainDao;
import com.xiaoqu.wygl.complain.dto.Complain;
import com.xiaoqu.wygl.complain.dto.ComplainCondition;
import com.xiaoqu.wygl.complain.service.ComplainService;

/**
 * 投诉建议ServiceImpl
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 下午2:09:48
 *
 */
@Service
public class ComplainServiceImpl implements ComplainService{

	@Resource
	private ComplainDao complainDao;
	
	public Integer add(Complain po) {
		return complainDao.add(po);
	}
	
	public int delete(Integer id) {
		return complainDao.delete(id);
	}
	
	public int update(Complain po) {
		return complainDao.update(po);
	}
	
	public Complain findById(Integer id) {
		return complainDao.findById(id);
	}
	
	public List<Complain> findPageByCondition(ComplainCondition pc) {
		return complainDao.findPageByCondition(pc);
	}
	
	public Integer countByCondition(ComplainCondition pc) {
		return complainDao.countByCondition(pc);
	}
}
