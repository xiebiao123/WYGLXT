package com.xiaoqu.wygl.user.dto;
/**
 * 用户信息实体类
 * @author xieb
 * @version 1.00
 * 2016/04/12
 */
public class User{

    /**  */
    private Integer id;
    /**  */
    private String name;
    /**  */
    private String idCard;
    /**  */
    private Long tel;
    /**  */
    private String email;
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


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }


    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
