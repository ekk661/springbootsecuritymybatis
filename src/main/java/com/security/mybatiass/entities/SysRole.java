package com.security.mybatiass.entities;

import java.io.Serializable;

/**
 * @author chape
 * @create 2018-10-06-9:03
 */
public class SysRole implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer id;

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

    private String name;
}
