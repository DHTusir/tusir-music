package com.tusir.tusirmusic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tusir
 * @version 1.0.0
 */
@RestController
@RequestMapping("/hello")
public class DefaultController {

    @GetMapping
    public String sayHello() {
        return "欢迎来到音乐盒";
    }
}
