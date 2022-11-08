package com.atguigu.boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author : zhousy
 * @date : 2022/11/8 15:15
 * @version : 1.0
 */

/**
 * 演示文件上传
 */

@Slf4j
@RestController
public class MultipartUploadController {
    @PostMapping("/upload")
    public void upload(@RequestPart("headFile") MultipartFile multipartFile,
                       @RequestPart("allFiles") MultipartFile[] multipartFiles) throws IOException {
        log.info(String.valueOf(multipartFile.getSize()));
        log.info(String.valueOf(multipartFiles.length));
        if (!multipartFile.isEmpty()) {

            multipartFile.transferTo(new File("C:\\Git\\学习\\" + multipartFile.getOriginalFilename()));
        }
        for (MultipartFile file : multipartFiles) {
            if (!file.isEmpty()) {

                file.transferTo(new File("C:\\Git\\学习\\" + file.getOriginalFilename()));
            }
        }
    }
}
