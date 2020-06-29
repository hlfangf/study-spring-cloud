package com.fhl;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableZuulProxy
//@EnableAutoConfiguration(exclude  = DataSourceAutoConfiguration.class)
@SpringBootApplication(exclude  = DataSourceAutoConfiguration.class)
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrixDashboard
public class RestApplication {

  
    public static void main(String[] args) {

        SpringApplication.run(RestApplication.class,args);
    }



//    /**
//     * 注入Rest对象
//     * @return 返回Rest对象
//     */
//    @Bean
//    public ServletRegistrationBean ServletRegistrationBeangetServlet() {
//
//        HystrixMetricsStreamServlet streamServlet =new HystrixMetricsStreamServlet();
//
//        ServletRegistrationBean registrationBean =new ServletRegistrationBean(streamServlet);
//
//        registrationBean.setLoadOnStartup(1);
//        registrationBean.addUrlMappings("/hystrix.stream");
//        registrationBean.setName("HystrixMetricsStreamServlet");
//        return registrationBean;
//
//    }


}
