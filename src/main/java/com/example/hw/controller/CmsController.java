package com.example.hw.controller;

import com.amazonaws.services.s3.model.PutObjectResult;
import com.example.hw.awsConfig.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by daou on 2017-09-27.
 */
@RestController
@RequestMapping(value="/cms")
public class CmsController {

    @Autowired
    private S3Service s3Service;

    @PostMapping("/image")
    @ResponseBody
    public PutObjectResult upload(@RequestParam("image") MultipartFile multipartFiles){
        return s3Service.upload(multipartFiles);
    }
}
