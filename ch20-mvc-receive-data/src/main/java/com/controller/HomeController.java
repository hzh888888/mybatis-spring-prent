package com.controller;

import com.entity.UserInfo;
import com.entity.UserInfoVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("/index")
    public String index(String abc,Integer age){
        System.out.println(abc+":"+age);
        return "index";
    }

    @RequestMapping("index2")
    public String index2(@RequestParam(value = "page",required = false,defaultValue = "1") int pageNo){
        System.out.println("pageNo = " + pageNo);
        return "index";
    }


    @RequestMapping("/index3/{page}")
    public String index3(@PathVariable("page") int page){
        System.out.println("page = " + page);
        return "index";
    }

    @GetMapping("/list2")
    public String bb(String[] name){
        for (int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
        return "index";
    }

    @GetMapping("/list")
    public String aa(UserInfoVO userInfoVO){
        System.out.println("userInfoVO = " + userInfoVO);
        return "index";
    }

    @GetMapping("/req")
    public String index(HttpServletRequest request){
        UserInfo userInfo=new UserInfo();
        userInfo.setId(1);
        userInfo.setSysUserInfo("张三");
        userInfo.setAge("12");
        request.setAttribute("userInfo",userInfo);

        return "index";
    }


}
