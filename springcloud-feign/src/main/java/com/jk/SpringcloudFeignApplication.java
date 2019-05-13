package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient      //  表明这是一个Eureka 消费者
@EnableDiscoveryClient   // 去服务中心注册
@EnableFeignClients        //开启 feign
public class SpringcloudFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFeignApplication.class, args);
    }

}
