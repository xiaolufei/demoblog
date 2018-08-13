package com.xiaoma.demoblog.mapper;

import com.xiaoma.demoblog.model.RUserRole;

public interface RUserRoleMapper {
    int insert(RUserRole record);

    int insertSelective(RUserRole record);
}