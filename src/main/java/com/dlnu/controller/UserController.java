package com.dlnu.controller;

import com.dlnu.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author haenu
 * @version 1.0
 * @date 2023/02/12 0:30
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestParam("name") String username, int age) {
        System.out.println("name======>"+username);
        System.out.println("age=======>"+age);
        return "{'module':'springmvc'}";
    }

    @RequestMapping("/pojouser")
    @ResponseBody
    public String pojol(User user){
        System.out.println(user);
        return "{'module':'springmvc'}";
    }

    @RequestMapping("/listTest")
    @ResponseBody
    public String ListTest(@RequestParam List<String> lists){
        System.out.println(lists);
        return "{'module':'springmvc'}";
    }

}
