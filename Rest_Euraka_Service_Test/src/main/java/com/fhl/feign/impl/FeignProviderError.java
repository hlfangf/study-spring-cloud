package com.fhl.feign.impl;

import com.fhl.constant.CodeConstant;
import com.fhl.feign.FeignProviderClient;
import com.fhl.po.UserInfo;
import com.fhl.vo.ResponseVo;
import org.springframework.stereotype.Component;


@Component
public class FeignProviderError implements FeignProviderClient {

    @Override
    public ResponseVo<String> insertUserInfo(UserInfo userInfo) {
        return new ResponseVo<>(CodeConstant.CONN_CLIENT_ERROR_CODE,"[Insert-UserInfo] conn client service url of insertUserInfo is error ! ");
    }
}
