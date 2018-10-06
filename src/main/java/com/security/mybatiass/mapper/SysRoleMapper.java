package com.security.mybatiass.mapper;

import com.security.mybatiass.entities.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author chape
 * @create 2018-10-06-9:06
 */
@Mapper
public interface SysRoleMapper {
    @Select("SELECT * FROM sys_role WHERE id = #{id}")
    SysRole selectById(Integer id);
}
