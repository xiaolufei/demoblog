package com.xiaoma.demoblog.mapper;

import com.xiaoma.demoblog.model.SysRole;
import com.xiaoma.demoblog.model.SysRoleWithBLOBs;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleWithBLOBs record);

    int insertSelective(SysRoleWithBLOBs record);

    SysRoleWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRoleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysRoleWithBLOBs record);

    int updateByPrimaryKey(SysRole record);
}