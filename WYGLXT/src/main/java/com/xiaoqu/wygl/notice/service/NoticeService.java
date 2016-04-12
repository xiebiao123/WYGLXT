package com.xiaoqu.wygl.notice.service;

import java.util.List;

import com.xiaoqu.wygl.notice.dto.Notice;
import com.xiaoqu.wygl.notice.dto.NoticeCondition;

/**
 * 公告信息Service
 * @version 1.0
 * @author xieb
 * @date 2014年12月9日 下午2:08:06
 *
 */
public interface NoticeService {

	/**
	 * 新增公告信息
	 */
	public Integer add(Notice po);
	/**
	 * 删除公告信息
	 */
	public int delete(Integer id);
	/**
	 * 修改公告信息
	 */
	public int update(Notice po);
	/**
	 * 根据id获取公告信息
	 */
	public Notice findById(Integer id);
	/**
	 * 分页查询公告信息
	 */
	public List<Notice> findPageByCondition(NoticeCondition pc);
	
	/**
	 * 统计查询数据的条数
	 */
	public Integer countByCondition(NoticeCondition pc);
	
}
