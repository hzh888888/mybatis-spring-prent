package com.controller;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLConnection;
import java.net.URLEncoder;

@Controller
public class Controller2 {

    public static final String FILE_DIRECTORY="G:/mybatis-spring-parent/ch28-mvc-zhonghe/web/file";
    @PostMapping("/upload")
    public String file(MultipartFile myfile){
        String fileName=myfile.getOriginalFilename();
        String path=FILE_DIRECTORY + File.separator + fileName;
        File file = new File(path);
        try {
            myfile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "ok";
    }

    @RequestMapping("/download")
    public ResponseEntity<InputStreamSource> download(String filename)throws IOException{
        String fullPath=FILE_DIRECTORY+File.separator+filename;

        File file=new File(fullPath);
        String mediaType= URLConnection.guessContentTypeFromName(filename);
        if(mediaType==null){
            mediaType= MediaType.APPLICATION_OCTET_STREAM_VALUE;
        }
        System.out.println("mediaType = " + mediaType);
        HttpHeaders respHeaders=new HttpHeaders();
        respHeaders.setContentType(MediaType.parseMediaType(mediaType));
        respHeaders.setContentDispositionFormData("attachment", URLEncoder.encode(filename,"UTF-8"));

        InputStreamResource isr=new InputStreamResource(new FileInputStream(file));
        return new ResponseEntity<>(isr,respHeaders, HttpStatus.OK);
    }
}
