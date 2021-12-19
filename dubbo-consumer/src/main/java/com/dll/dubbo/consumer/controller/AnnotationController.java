package com.dll.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dll.dubbo.api.service.AnnotationService;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class AnnotationController {
    @Reference
    private AnnotationService annotationService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String sayHello(){
        Random random = new Random();
        int nextInt = random.nextInt();
        String name = "id#" + nextInt;
        System.out.println("sayHello called in consumer, name" + name);
        return annotationService.sayHello(name);
    }
}
