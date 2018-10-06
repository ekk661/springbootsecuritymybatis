package com.security.mybatiass.mapper;

import com.security.mybatiass.entities.SysUserRole;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author chape
 * @create 2018-10-06-9:06
 */
public interface SysUserRoleMapper {
    @Select("SELECT * FROM sys_user_role WHERE user_id = #{userId}")
    List<SysUserRole> listByUserId(Integer userId);
}
