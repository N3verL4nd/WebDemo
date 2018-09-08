package com.meituan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author n3verl4nd
 */
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String test() {
        return "美团";
    }
}
