package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class FileController {


    @PostMapping("/upload")
    public  String upload(MultipartFile myfile){
        String directory="G:\\mybatis-spring-parent\\ch27-mvc-file\\web\\file";
        String filename=myfile.getOriginalFilename();
        String path=directory+ File.separator+filename;
        File file=new File(path);
        try {
            myfile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "ok";
    }
}
