package com.xiaoqu.wygl.room.dto;

import java.sql.Timestamp;

/**
 * 房间信息实体类
 * @author xieb
 * @version 1.00
 * 2016/04/12
 */
public class Room{

    /**  */
    private Integer id;
    /**  */
    private Integer houseId;
    /**  */
    private Integer roomId;
    /**  */
    private Integer floor;
    /**  */
    private Double space;
    /**  */
    private String userId;
    /**  */
    private Timestamp startTime;
    /**  */
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }


    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }


    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }


    public Double getSpace() {
        return space;
    }

    public void setSpace(Double space) {
        this.space = space;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
