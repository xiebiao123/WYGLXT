package com.xiaoqu.wygl.worker.dto;
/**
 * 员工信息实体类
 * @author xieb
 * @version 1.00
 * 2016/04/12
 */
public class Worker{

    /**  */
    private Integer id;
    /**  */
    private String name;
    /**  */
    private String type;


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


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
