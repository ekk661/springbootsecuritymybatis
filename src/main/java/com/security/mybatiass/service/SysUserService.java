package com.security.mybatiass.service;

import com.security.mybatiass.entities.SysUser;
import com.security.mybatiass.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chape
 * @create 2018-10-06-9:07
 */
@Service
public class SysUserService {
    @Autowired
    SysUserMapper userMapper;
    public SysUser selectById(Integer id){
        return userMapper.selectById(id);
    }
    public SysUser selectByName(String name){
        return userMapper.selectByName(name);
    }
}
