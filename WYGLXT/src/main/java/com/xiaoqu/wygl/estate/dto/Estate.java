package com.xiaoqu.wygl.estate.dto;
/**
 * 小区信息实体类
 * @author xieb
 * @version 1.00
 * 2016/04/12
 */
public class Estate{

    /**  */
    private Integer id;
    /**  */
    private String name;
    /**  */
    private Double floorSpace;
    /**  */
    private Double roadSpace;
    /**  */
    private Double buildSpace;
    /**  */
    private Double greenSpace;
    /**  */
    private Integer buildCount;
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


    public Double getFloorSpace() {
        return floorSpace;
    }

    public void setFloorSpace(Double floorSpace) {
        this.floorSpace = floorSpace;
    }


    public Double getRoadSpace() {
        return roadSpace;
    }

    public void setRoadSpace(Double roadSpace) {
        this.roadSpace = roadSpace;
    }


    public Double getBuildSpace() {
        return buildSpace;
    }

    public void setBuildSpace(Double buildSpace) {
        this.buildSpace = buildSpace;
    }


    public Double getGreenSpace() {
        return greenSpace;
    }

    public void setGreenSpace(Double greenSpace) {
        this.greenSpace = greenSpace;
    }


    public Integer getBuildCount() {
        return buildCount;
    }

    public void setBuildCount(Integer buildCount) {
        this.buildCount = buildCount;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
