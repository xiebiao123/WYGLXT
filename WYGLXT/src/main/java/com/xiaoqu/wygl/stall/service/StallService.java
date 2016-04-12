package com.xiaoqu.wygl.stall.service;

import java.util.List;

import com.xiaoqu.wygl.stall.dto.Stall;
import com.xiaoqu.wygl.stall.dto.StallCondition;

/**
 * 车位信息Service
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 下午2:08:06
 *
 */
public interface StallService {

	/**
	 * 新增车位信息
	 */
	public Integer add(Stall po);
	/**
	 * 删除车位信息
	 */
	public int delete(Integer id);
	/**
	 * 修改车位信息
	 */
	public int update(Stall po);
	/**
	 * 根据id获取车位信息
	 */
	public Stall findById(Integer id);
	/**
	 * 分页查询车位信息
	 */
	public List<Stall> findPageByCondition(StallCondition pc);
	
	/**
	 * 统计查询数据的条数
	 */
	public Integer countByCondition(StallCondition pc);
	
}
