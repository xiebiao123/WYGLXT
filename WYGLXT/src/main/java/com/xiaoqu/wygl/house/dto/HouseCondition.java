package com.xiaoqu.wygl.house.dto;

import java.sql.Timestamp;

import com.xiaoqu.wygl.util.Paging;
/**
 * 单元楼信息condition
 * @author xieb
 * @version 1.00
 * 2016/04/12
 */
public class HouseCondition extends Paging{

    /**  */
    private Integer id;

    /**  */
    private String name;

    /**  */
    private Double height;

    /**  */
    private Integer storey;

    /**  */
    private Double space;

    /**  */
    private Timestamp creatTime;

    /**  */
    private String remark;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer getStorey() {
        return storey;
    }

    public void setStorey(Integer storey) {
        this.storey = storey;
    }

    public Double getSpace() {
        return space;
    }

    public void setSpace(Double space) {
        this.space = space;
    }

    public Timestamp getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Timestamp creatTime) {
        this.creatTime = creatTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

