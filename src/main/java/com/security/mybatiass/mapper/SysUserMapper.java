package com.security.mybatiass.mapper;

import com.security.mybatiass.entities.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author chape
 * @create 2018-10-06-9:05
 */
@Mapper
public interface SysUserMapper {
    @Select("SELECT * FROM sys_user WHERE id = #{id}")
    SysUser selectById(Integer id);

    @Select("SELECT * FROM sys_user WHERE name = #{name}")
    SysUser selectByName(String name);


}
