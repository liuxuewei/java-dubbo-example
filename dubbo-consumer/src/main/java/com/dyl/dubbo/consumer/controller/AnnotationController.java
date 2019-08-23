package com.dyl.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dyl.dubbo.api.service.AnnotationService;
import org.springframework.web.bind.annotation.*;

@RestController
public class AnnotationController {
    @Reference
    private AnnotationService annotationService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return annotationService.sayHello(name);
    }
}
