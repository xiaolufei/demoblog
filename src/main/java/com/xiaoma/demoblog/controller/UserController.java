package com.xiaoma.demoblog.controller;

import com.xiaoma.demoblog.model.SysUser;
import com.xiaoma.demoblog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private SysUserService userService;

    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addUser(SysUser user){
        user.setUpdateId(1);
        user.setCreatId(1);
        user.setUpdateTime(new Date());
        user.setCreatTime(new Date());
        return userService.addUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return userService.findAllUser(pageNum,pageSize);
    }


}
