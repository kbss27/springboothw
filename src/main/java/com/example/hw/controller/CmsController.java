package com.example.hw.controller;

import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.example.hw.service.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * Created by hyunwoo on 2017-09-27.
 */

@Controller
@RequestMapping(value="/cms")
public class CmsController {

    @Autowired
    private S3Service s3Service;

    @GetMapping
    public String cms() {
        return "cms";
    }

    @PostMapping("/upload")
    @ResponseBody
    public PutObjectResult upload(@RequestParam("file") MultipartFile multipartFiles) {
        return s3Service.upload(multipartFiles);
    }

    @GetMapping("/list")
    @ResponseBody
    public List<S3ObjectSummary> list() throws IOException {
        return s3Service.list();
    }

    @GetMapping("/download")
    @ResponseBody
    public ResponseEntity<byte[]> download(@RequestParam String key) throws IOException {
        return s3Service.download(key);
    }

}
