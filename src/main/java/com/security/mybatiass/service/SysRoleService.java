package com.security.mybatiass.service;

import com.security.mybatiass.entities.SysRole;
import com.security.mybatiass.mapper.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chape
 * @create 2018-10-06-20:21
 */
@Service
public class SysRoleService {
    @Autowired
    SysRoleMapper roleMapper;
    public SysRole selectById(Integer id){
        return  roleMapper.selectById(id);
    }
}
