package com.xiaoqu.wygl.user.dao.impl;

import org.springframework.stereotype.Repository;

import com.xiaoqu.wygl.base.BaseDaoImpl;
import com.xiaoqu.wygl.user.dao.UserDao;
import com.xiaoqu.wygl.user.dto.User;
import com.xiaoqu.wygl.user.dto.UserCondition;

/**
 * 用户信息daoImpl
 * @author xieb
 * @version 1.00
 * 2016/04/12
 */
 
@Repository
public class UserDaoImpl extends BaseDaoImpl<User,UserCondition> implements UserDao{
	
}
