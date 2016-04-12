package com.xiaoqu.wygl.type.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.xiaoqu.wygl.type.dao.TypeDao;
import com.xiaoqu.wygl.type.dto.Type;
import com.xiaoqu.wygl.type.dto.TypeCondition;
import com.xiaoqu.wygl.type.service.TypeService;

/**
 * 收费标准ServiceImpl
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 下午2:09:48
 *
 */
@Service
public class TypeServiceImpl implements TypeService{

	@Resource
	private TypeDao typeDao;
	
	public Integer add(Type po) {
		return typeDao.add(po);
	}
	
	public int delete(Integer id) {
		return typeDao.delete(id);
	}
	
	public int update(Type po) {
		return typeDao.update(po);
	}
	
	public Type findById(Integer id) {
		return typeDao.findById(id);
	}
	
	public List<Type> findPageByCondition(TypeCondition pc) {
		return typeDao.findPageByCondition(pc);
	}
	
	public Integer countByCondition(TypeCondition pc) {
		return typeDao.countByCondition(pc);
	}
}
