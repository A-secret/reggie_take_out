package com.itheima.reggie.controller;

import com.itheima.reggie.common.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author macbookpro
 * @Date 2022/7/3 12:17
 * @Description:
 * @Version 1.0
 */
@RestController
@RequestMapping("/common")
public class CommonController {

    /**
     * 文件上传
     * @param file
     * @return
     */
    @PostMapping("/upload")
    public R<String> upload(MultipartFile file){
         return null;
    }
}
