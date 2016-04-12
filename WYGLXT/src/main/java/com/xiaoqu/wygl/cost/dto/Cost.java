package com.xiaoqu.wygl.cost.dto;

import java.sql.Timestamp;

/**
 * 收费详细实体类
 * @author xieb
 * @version 1.00
 * 2016/04/12
 */
public class Cost{

    /**  */
    private Integer id;
    /**  */
    private Integer count;
    /**  */
    private Integer type;
    /**  */
    private Double price;
    /**  */
    private Integer userId;
    /**  */
    private Integer status;
    /**  */
    private String remark;
    /**  */
    private Timestamp startTime;
    /**  */
    private Timestamp endTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

}
