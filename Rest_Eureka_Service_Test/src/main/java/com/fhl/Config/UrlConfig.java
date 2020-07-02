package com.fhl.Config;

import com.fhl.factory.YamlPropertySourceFactory;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "config/urlConfig.yml",factory = YamlPropertySourceFactory.class)
@Getter
@Setter
public class UrlConfig {

    @Value("${clientEurekaServiceUrlPrefix}"+"${clientEurekaService.insertUserInfoUrlSuffix}")
    private String insertUserInfoUrl;
}
