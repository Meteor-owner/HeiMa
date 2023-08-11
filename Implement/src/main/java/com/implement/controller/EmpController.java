package com.implement.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 员工管理Controller
 */
@RestController
public class EmpController {
    @RequestMapping("/getpost")
    public void Getpost(@RequestBody String str){
        System.out.println(str);
    }
}
