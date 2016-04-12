package com.xiaoqu.wygl.worker.service;

import java.util.List;

import com.xiaoqu.wygl.worker.dto.Worker;
import com.xiaoqu.wygl.worker.dto.WorkerCondition;

/**
 * 员工信息Service
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 下午2:08:06
 *
 */
public interface WorkerService {

	/**
	 * 新增员工信息
	 */
	public Integer add(Worker po);
	/**
	 * 删除员工信息
	 */
	public int delete(Integer id);
	/**
	 * 修改员工信息
	 */
	public int update(Worker po);
	/**
	 * 根据id获取员工信息
	 */
	public Worker findById(Integer id);
	/**
	 * 分页查询员工信息
	 */
	public List<Worker> findPageByCondition(WorkerCondition pc);
	
	/**
	 * 统计查询数据的条数
	 */
	public Integer countByCondition(WorkerCondition pc);
	
}
