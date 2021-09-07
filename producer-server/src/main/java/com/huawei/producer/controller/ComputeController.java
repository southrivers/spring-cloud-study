package com.huawei.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputeController {


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer compute(@RequestParam Integer a, @RequestParam Integer b) {

        return a+b;
    }
}
