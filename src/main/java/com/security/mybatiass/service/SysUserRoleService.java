package com.security.mybatiass.service;

import com.security.mybatiass.entities.SysUserRole;
import com.security.mybatiass.mapper.SysUserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chape
 * @create 2018-10-06-20:23
 */
@Service
public class SysUserRoleService {
    @Autowired
    SysUserRoleMapper userRoleMapper;
    public List<SysUserRole> listByUserId(Integer userId){
        return userRoleMapper.listByUserId(userId);
    }
}
