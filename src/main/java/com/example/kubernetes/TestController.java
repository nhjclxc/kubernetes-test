package com.example.kubernetes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LuoXianchao
 * @since 2024/03/09 16:17
 */

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping
    public String test(){
        System.out.println("TestController");
        return "TestController Hello";
    }
}
