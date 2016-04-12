package com.xiaoqu.wygl.cost.service;

import java.util.List;

import com.xiaoqu.wygl.cost.dto.Cost;
import com.xiaoqu.wygl.cost.dto.CostCondition;

/**
 * 收费详细Service
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 下午2:08:06
 *
 */
public interface CostService {

	/**
	 * 新增收费详细
	 */
	public Integer add(Cost po);
	/**
	 * 删除收费详细
	 */
	public int delete(Integer id);
	/**
	 * 修改收费详细
	 */
	public int update(Cost po);
	/**
	 * 根据id获取收费详细
	 */
	public Cost findById(Integer id);
	/**
	 * 分页查询收费详细
	 */
	public List<Cost> findPageByCondition(CostCondition pc);
	
	/**
	 * 统计查询数据的条数
	 */
	public Integer countByCondition(CostCondition pc);
	
}
