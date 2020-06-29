package com.fhl.feign;

import com.fhl.feign.impl.FeignProviderError;
import com.fhl.po.UserInfo;
import com.fhl.vo.ResponseVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "provider",fallback = FeignProviderError.class)
public interface FeignProviderClient {

    @PostMapping("/inserUserInfo")
    ResponseVo<String> insertUserInfo(UserInfo userInfo);

}
