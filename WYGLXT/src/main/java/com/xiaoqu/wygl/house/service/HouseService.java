package com.xiaoqu.wygl.house.service;

import java.util.List;

import com.xiaoqu.wygl.house.dto.House;
import com.xiaoqu.wygl.house.dto.HouseCondition;

/**
 * 单元楼信息Service
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 下午2:08:06
 *
 */
public interface HouseService {

	/**
	 * 新增单元楼信息
	 */
	public Integer add(House po);
	/**
	 * 删除单元楼信息
	 */
	public int delete(Integer id);
	/**
	 * 修改单元楼信息
	 */
	public int update(House po);
	/**
	 * 根据id获取单元楼信息
	 */
	public House findById(Integer id);
	/**
	 * 分页查询单元楼信息
	 */
	public List<House> findPageByCondition(HouseCondition pc);
	
	/**
	 * 统计查询数据的条数
	 */
	public Integer countByCondition(HouseCondition pc);
	
}
