package com.xiaoqu.wygl.type.service;

import java.util.List;

import com.xiaoqu.wygl.type.dto.Type;
import com.xiaoqu.wygl.type.dto.TypeCondition;

/**
 * 收费标准Service
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 下午2:08:06
 *
 */
public interface TypeService {

	/**
	 * 新增收费标准
	 */
	public Integer add(Type po);
	/**
	 * 删除收费标准
	 */
	public int delete(Integer id);
	/**
	 * 修改收费标准
	 */
	public int update(Type po);
	/**
	 * 根据id获取收费标准
	 */
	public Type findById(Integer id);
	/**
	 * 分页查询收费标准
	 */
	public List<Type> findPageByCondition(TypeCondition pc);
	
	/**
	 * 统计查询数据的条数
	 */
	public Integer countByCondition(TypeCondition pc);
	
}
