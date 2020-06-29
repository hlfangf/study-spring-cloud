package com.fhl.controller;

import com.fhl.constant.CodeConstant;
import com.fhl.po.UserInfo;
import com.fhl.service.IUserInfoService;
import com.fhl.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserInfoController {

    @Autowired
    private IUserInfoService userInfoService;

    @Value("${server.port}")
    private String prividerPort;

    @PostMapping("/inserUserInfo")
    @ResponseBody
    public ResponseVo<String> insertUserInfo(@RequestBody UserInfo userInfo){
        userInfoService.insertUserInfo(userInfo);


        return new ResponseVo<>(CodeConstant.SUCCESS_CODE,prividerPort);
    }
}
