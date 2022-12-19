package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulAppliction {
    public static void main(String[] args) {
        SpringApplication.run(ZuulAppliction.class,args);
    }
}
