package com.xiaoqu.wygl.complain.service;

import java.util.List;

import com.xiaoqu.wygl.complain.dto.Complain;
import com.xiaoqu.wygl.complain.dto.ComplainCondition;

/**
 * 投诉建议Service
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 下午2:08:06
 *
 */
public interface ComplainService {

	/**
	 * 新增投诉建议
	 */
	public Integer add(Complain po);
	/**
	 * 删除投诉建议
	 */
	public int delete(Integer id);
	/**
	 * 修改投诉建议
	 */
	public int update(Complain po);
	/**
	 * 根据id获取投诉建议
	 */
	public Complain findById(Integer id);
	/**
	 * 分页查询投诉建议
	 */
	public List<Complain> findPageByCondition(ComplainCondition pc);
	
	/**
	 * 统计查询数据的条数
	 */
	public Integer countByCondition(ComplainCondition pc);
	
}
