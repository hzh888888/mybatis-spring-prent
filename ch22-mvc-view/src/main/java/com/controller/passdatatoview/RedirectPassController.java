package com.controller.passdatatoview;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/redirect")
public class RedirectPassController {

    @RequestMapping("/demo11")
   public String demo11(HttpSession session){
       session.setAttribute("f","黄志换");
       return "redirect:demo12";
   }

   @RequestMapping("/demo12")
   public String demo12(){
        return "index";
   }

    @RequestMapping("/demo21")
    public String demo21(){
        return "redirect:demo22?f=aaaa";
    }

    @RequestMapping("/demo22")
    public String demo22(String f, Model model){
        model.addAttribute("f",f);
        return "index";
    }

    @GetMapping("/demo31")
    public String demo31(RedirectAttributes redirectAttributes){
        //因为我们是重定向到32,所以addAttribute添加的数据自动帮我们拼接到url上
        redirectAttributes.addAttribute("f1", "demo31 f1");
        // addFlashAttribute是把数据自动放到session中,跳转到的方法demo32的model参数自动有这个值.
        redirectAttributes.addFlashAttribute("f", "demo3-flash");
        return "redirect:demo32";
    }

    @GetMapping("/demo32")
    public String demo32(String f, Model model){
        return "index";
    }

    //因为addFlashAttribute是把数据放到session中,读取到了之后自动从session中删除数据
    //这个方法用来演示已经读不到数据,操作步骤:/demo31->跳转到了32,接着访问/demo33
    @GetMapping("/demo33")
    public String demo33(){
        return "index";
    }
}


