package com.example.springcloud.feign.impl;

import com.example.springcloud.entity.Student;
import com.example.springcloud.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignEorror implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中.....";
    }
}
