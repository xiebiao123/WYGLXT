package com.xiaoqu.wygl.stall.dto;

import java.sql.Timestamp;

/**
 * 车位信息实体类
 * @author xieb
 * @version 1.00
 * 2016/04/12
 */
public class Stall{

    /**  */
    private Integer id;
    /**  */
    private Integer status;
    /**  */
    private Timestamp startTime;
    /**  */
    private Timestamp endTime;
    /**  */
    private Integer userId;
    /**  */
    private String remark;
    /**  */
    private Double cost;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }


    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

}
