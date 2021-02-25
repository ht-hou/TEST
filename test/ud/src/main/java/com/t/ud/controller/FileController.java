package com.t.ud.controller;

import com.t.ud.service.UDService;
import com.t.ud.utils.FileControl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class FileController {

    @Resource
    UDService udService;

    @RequestMapping("/selectAll")
    public List<String> getAll() {
        return udService.getAll();
    }

    //使用默认路径
    @RequestMapping("/upload")
    public String upload(MultipartFile file) throws Exception {

        String originalFilename = file.getOriginalFilename();
        String lastName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
        boolean lj = FileControl.LJ(lastName);
        if (lj)
            udService.upload(file, null);
        return null;
    }

    //自定义路径
    @RequestMapping("/upload/template")
    public String uploadPlace(MultipartFile file) throws Exception {
        udService.upload(file, "D:\\upload");

        return null;
    }

    //下载
    @RequestMapping(value = "/download/file")
    public String downloadFile(@RequestParam String fileName, HttpServletResponse response) throws IOException {

        udService.download(response, fileName);

        return null;
    }
}