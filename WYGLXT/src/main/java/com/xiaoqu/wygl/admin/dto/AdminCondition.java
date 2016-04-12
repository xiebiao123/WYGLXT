package com.xiaoqu.wygl.admin.dto;

import com.xiaoqu.wygl.util.Paging;
/**
 * 系统管理员condition
 * @author xieb
 * @version 1.00
 * 2016/04/12
 */
public class AdminCondition extends Paging{

    /**  */
    private Integer id;

    /**  */
    private String name;

    /**  */
    private String passWord;

    /**  */
    private Long tel;

    /**  */
    private String email;



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

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
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
}

