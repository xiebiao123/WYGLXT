package com.xiaoqu.wygl.user.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.xiaoqu.wygl.user.dao.UserDao;
import com.xiaoqu.wygl.user.dto.User;
import com.xiaoqu.wygl.user.dto.UserCondition;
import com.xiaoqu.wygl.user.service.UserService;

/**
 * 用户信息ServiceImpl
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 下午2:09:48
 *
 */
@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao userDao;
	
	public Integer add(User po) {
		return userDao.add(po);
	}
	
	public int delete(Integer id) {
		return userDao.delete(id);
	}
	
	public int update(User po) {
		return userDao.update(po);
	}
	
	public User findById(Integer id) {
		return userDao.findById(id);
	}
	
	public List<User> findPageByCondition(UserCondition pc) {
		return userDao.findPageByCondition(pc);
	}
	
	public Integer countByCondition(UserCondition pc) {
		return userDao.countByCondition(pc);
	}
}
