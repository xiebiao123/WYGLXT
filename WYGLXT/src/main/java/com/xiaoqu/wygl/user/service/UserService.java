package com.xiaoqu.wygl.user.service;

import java.util.List;

import com.xiaoqu.wygl.user.dto.User;
import com.xiaoqu.wygl.user.dto.UserCondition;

/**
 * 用户信息Service
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 下午2:08:06
 *
 */
public interface UserService {

	/**
	 * 新增用户信息
	 */
	public Integer add(User po);
	/**
	 * 删除用户信息
	 */
	public int delete(Integer id);
	/**
	 * 修改用户信息
	 */
	public int update(User po);
	/**
	 * 根据id获取用户信息
	 */
	public User findById(Integer id);
	/**
	 * 分页查询用户信息
	 */
	public List<User> findPageByCondition(UserCondition pc);
	
	/**
	 * 统计查询数据的条数
	 */
	public Integer countByCondition(UserCondition pc);
	
}
