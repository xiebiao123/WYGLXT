package com.xiaoqu.wygl.worker.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.xiaoqu.wygl.worker.dao.WorkerDao;
import com.xiaoqu.wygl.worker.dto.Worker;
import com.xiaoqu.wygl.worker.dto.WorkerCondition;
import com.xiaoqu.wygl.worker.service.WorkerService;

/**
 * 员工信息ServiceImpl
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 下午2:09:48
 *
 */
@Service
public class WorkerServiceImpl implements WorkerService{

	@Resource
	private WorkerDao workerDao;
	
	public Integer add(Worker po) {
		return workerDao.add(po);
	}
	
	public int delete(Integer id) {
		return workerDao.delete(id);
	}
	
	public int update(Worker po) {
		return workerDao.update(po);
	}
	
	public Worker findById(Integer id) {
		return workerDao.findById(id);
	}
	
	public List<Worker> findPageByCondition(WorkerCondition pc) {
		return workerDao.findPageByCondition(pc);
	}
	
	public Integer countByCondition(WorkerCondition pc) {
		return workerDao.countByCondition(pc);
	}
}
