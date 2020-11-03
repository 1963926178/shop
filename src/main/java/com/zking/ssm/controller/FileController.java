package com.zking.ssm.controller;

import com.zking.ssm.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Controller
@RequestMapping("/file")
public class FileController {

    @Autowired
    private IFileService fileService;

    @RequestMapping("/toUpload")
    public String toUpload(){
        return "/upload";
    }

    @RequestMapping("/upload")
    public String upload(MultipartFile img) throws Exception{
//        //1.将上传文件信息保存到数据库
//        String fileId = UUID.randomUUID().toString().replace("-","");
//        String realName = img.getOriginalFilename();
//        String str  = realName.substring(realName.lastIndexOf("."));
//        String contentType= img.getContentType();
//        String url = "E:\\图片\\作业\\"+System.currentTimeMillis()+str;
//
//        com.zking.ssm.model.File file = new com.zking.ssm.model.File(fileId,realName,contentType,url);
//        fileService.add(file);
//
//        //2.将文件上传到目标服务器
//        File targetFile = new File(url);
//        img.transferTo(targetFile);

        return "/index";
    }
}
