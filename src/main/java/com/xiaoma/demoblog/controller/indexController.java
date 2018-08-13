package com.xiaoma.demoblog.controller;

import com.xiaoma.demoblog.model.SysUser;
import com.xiaoma.demoblog.requstVo.TransactionResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class indexController {

    @RequestMapping("/login")
    public String login(Model model){

        model.addAttribute("masge","登录");
        return "login";
    }

    @RequestMapping("/regist")
    @ResponseBody
    public TransactionResult regist(SysUser user){

        return new TransactionResult(user);
    }


}
