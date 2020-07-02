package com.fhl.service.impl;

import com.fhl.mapper.UserInfoMapper;
import com.fhl.service.IUserInfoService;
import com.fhl.po.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl  implements IUserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        userInfoMapper.insertUserInfo(userInfo);
    }
}
