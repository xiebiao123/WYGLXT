package com.xiaoqu.wygl.estate.service;

import java.util.List;

import com.xiaoqu.wygl.estate.dto.Estate;
import com.xiaoqu.wygl.estate.dto.EstateCondition;

/**
 * 小区信息Service
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 下午2:08:06
 *
 */
public interface EstateService {

	/**
	 * 新增小区信息
	 */
	public Integer add(Estate po);
	/**
	 * 删除小区信息
	 */
	public int delete(Integer id);
	/**
	 * 修改小区信息
	 */
	public int update(Estate po);
	/**
	 * 根据id获取小区信息
	 */
	public Estate findById(Integer id);
	/**
	 * 分页查询小区信息
	 */
	public List<Estate> findPageByCondition(EstateCondition pc);
	
	/**
	 * 统计查询数据的条数
	 */
	public Integer countByCondition(EstateCondition pc);
	
}
