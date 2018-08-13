package com.xiaoma.demoblog.service.impl;


import com.github.pagehelper.PageHelper;
import com.xiaoma.demoblog.mapper.SysUserMapper;
import com.xiaoma.demoblog.model.SysUser;
import com.xiaoma.demoblog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public int addUser(SysUser user) {
        return sysUserMapper.insert(user);
    }

    @Override
    public List<SysUser> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        return sysUserMapper.selectAllUser();
    }
}
