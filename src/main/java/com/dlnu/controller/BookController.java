package com.dlnu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author haenu
 * @version 1.0
 * @date 2023/02/13 16:14
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("book save...");
        return "{'module':'springmvc'}";
    }
}
