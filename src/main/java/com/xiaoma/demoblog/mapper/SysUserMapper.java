package com.xiaoma.demoblog.mapper;

import com.xiaoma.demoblog.model.SysUser;

import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    //这个方式我自己加的
    List<SysUser> selectAllUser();
}