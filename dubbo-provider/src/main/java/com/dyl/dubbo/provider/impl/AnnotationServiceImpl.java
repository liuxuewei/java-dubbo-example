package com.dyl.dubbo.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dyl.dubbo.api.service.AnnotationService;
import org.springframework.stereotype.Component;

@Component
@Service
public class AnnotationServiceImpl implements AnnotationService {

    @Override
    public String sayHello(String name) {
        return "Hello：" + name;
    }
}
