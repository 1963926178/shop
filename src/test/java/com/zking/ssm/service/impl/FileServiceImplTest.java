package com.zking.ssm.service.impl;

import com.zking.ssm.model.File;
import com.zking.ssm.service.IFileService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

import static org.junit.Assert.*;

public class FileServiceImplTest extends BaseTestCase {

    @Autowired
    private IFileService fileService;
    private com.zking.ssm.model.File file;

    @Override
    public void setUp() {
        super.setUp();
        file = new com.zking.ssm.model.File();
    }

    @Test
    public void add() {
        String fileId = UUID.randomUUID().toString().replace("-","");
        String realName = "翔哥自拍1.jpg";
        String str  = realName.substring(realName.lastIndexOf("."));
        String contentType="jpg/png/jpeg/img";
        String url = "E:\\图片\\作业\\"+System.currentTimeMillis()+str;

        file = new File(fileId,realName,contentType,url);
        fileService.add(file);
    }

    @Test
    public void load() {
        file.setFileId("8bfe930f825f433ea53aabcb6e816823");
        File load = fileService.load(file);
        System.out.println(load);
    }
}
