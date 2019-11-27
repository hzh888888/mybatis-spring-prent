package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class DengLuController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @PostMapping("/add")
    public String index2(String name,String pwd ,HttpSession session){
        if(name.equals("root")&pwd.equals("1234")){
            session.setAttribute("name",name);
        }
        return "redirect:index";
    }
}
