package com.controller;

/**
 * Created by apple on 16/9/4.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

@Controller // 或 @RequestMapping
public class HelloWorldController {
    @RequestMapping(value = "/hello")
    public ModelAndView helloWorld() {
//1将一个POJO类声明为处理器 //2请求URL到处理器功能处理方法的映射
//1、收集参数
//2、绑定参数到命令对象
//3、调用业务对象
//4、选择下一个页面
        ModelAndView mv = new ModelAndView();
//添加模型数据 可以是任意的POJO对象
        mv.addObject("message", "MESSAGE HELLO"); //设置逻辑视图名,视图解析器会根据该名字解析到具体的视图页面 mv.setViewName("hello");
        return mv; //○3 模型数据和逻辑视图名 }
    }


}