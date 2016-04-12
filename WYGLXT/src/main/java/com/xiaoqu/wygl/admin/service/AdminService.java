package com.xiaoqu.wygl.admin.service;

import java.util.List;

import com.xiaoqu.wygl.admin.dto.Admin;
import com.xiaoqu.wygl.admin.dto.AdminCondition;

/**
 * 系统管理员Service
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 下午2:08:06
 *
 */
public interface AdminService {

	/**
	 * 新增系统管理员
	 */
	public Integer add(Admin po);
	/**
	 * 删除系统管理员
	 */
	public int delete(Integer id);
	/**
	 * 修改系统管理员
	 */
	public int update(Admin po);
	/**
	 * 根据id获取系统管理员
	 */
	public Admin findById(Integer id);
	/**
	 * 分页查询系统管理员
	 */
	public List<Admin> findPageByCondition(AdminCondition pc);
	
	/**
	 * 统计查询数据的条数
	 */
	public Integer countByCondition(AdminCondition pc);
	
}
