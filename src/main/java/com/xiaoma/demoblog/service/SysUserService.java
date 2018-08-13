package com.xiaoma.demoblog.service;

import com.xiaoma.demoblog.model.SysUser;

import java.util.List;

public interface SysUserService {
    int addUser(SysUser user);

    List<SysUser> findAllUser(int pageNum, int pageSize);
}
