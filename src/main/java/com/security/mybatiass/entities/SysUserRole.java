package com.security.mybatiass.entities;

import java.io.Serializable;

/**
 * @author chape
 * @create 2018-10-06-9:04
 */
public class SysUserRole implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer userId;

    private Integer roleId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
