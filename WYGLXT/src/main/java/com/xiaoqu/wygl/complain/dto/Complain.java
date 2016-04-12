package com.xiaoqu.wygl.complain.dto;

import java.sql.Timestamp;

/**
 * 投诉建议实体类
 * @author xieb
 * @version 1.00
 * 2016/04/12
 */
public class Complain{

    /**  */
    private Integer id;
    /**  */
    private Integer userId;
    /**  */
    private String content;
    /**  */
    private Timestamp startTime;
    /**  */
    private Integer workId;
    /**  */
    private Integer status;
    /**  */
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }


    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
