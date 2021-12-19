package com.dll.dubbo.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dll.dubbo.api.service.AnnotationService;
import org.springframework.stereotype.Component;

@Component

@Service(version="1.0.0")
public class AnnotationServiceImpl implements AnnotationService {

    @Override
    public String sayHello(String name) {
        System.out.println("sayHello called in provider, name" + name);
        return "Hello：" + name;
    }
}
