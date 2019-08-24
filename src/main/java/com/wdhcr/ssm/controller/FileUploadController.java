package com.wdhcr.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class FileUploadController {
    @RequestMapping(value = "/upload")
    public String uploadFile(MultipartFile files){

        String path1 = files.getOriginalFilename();
        String path = "F:\\DummyDir"+path1;
        if (files!= null){
            try {
                files.transferTo(new File(path));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "susses.jsp";
        }else {
            return "error.jsp";
        }
    }
}
