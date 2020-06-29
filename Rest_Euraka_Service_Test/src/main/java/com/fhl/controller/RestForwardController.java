package com.fhl.controller;

import com.fhl.Config.UrlConfig;
import com.fhl.feign.FeignProviderClient;
import com.fhl.po.UserInfo;
import com.fhl.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestForwardController {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private FeignProviderClient feignProviderClient;

    @Autowired
    private UrlConfig urlConfig;

//    @PostMapping
//    public ResponseVo<String> insertUserInfo(@RequestBody UserInfo userInfo){
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
//        String httpBody = JSONObject.toJSONString(userInfo);
//        HttpEntity<String> httpEntity = new HttpEntity<String>(httpBody, headers);
//        ResponseVo<String> responseVo = restTemplate.postForEntity(urlConfig.getInsertUserInfoUrl(), httpEntity, ResponseVo.class).getBody();
//        return responseVo;
//    }

    @PostMapping("/insertUserInfo")
    public ResponseVo<String> insertUserInfo(@RequestBody UserInfo userInfo){
        ResponseVo<String> responseVo = feignProviderClient.insertUserInfo(userInfo);
        return responseVo;
    }
}
