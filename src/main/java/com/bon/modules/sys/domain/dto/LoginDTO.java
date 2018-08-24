package com.bon.modules.sys.domain.dto;

import com.bon.common.domain.dto.BaseDTO;

/**
 * @program: bon基础项目
 * @description: 登录参数
 * @author: Bon
 * @create: 2018-05-16 11:16
 **/
public class LoginDTO extends BaseDTO{
    private String username;
    private String password;
    private String code;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
