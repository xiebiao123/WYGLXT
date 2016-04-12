package com.xiaoqu.wygl.type.dto;
/**
 * 收费标准实体类
 * @author xieb
 * @version 1.00
 * 2016/04/12
 */
public class Type{

    /**  */
    private Integer id;
    /**  */
    private String name;
    /**  */
    private Double norm;


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


    public Double getNorm() {
        return norm;
    }

    public void setNorm(Double norm) {
        this.norm = norm;
    }

}
