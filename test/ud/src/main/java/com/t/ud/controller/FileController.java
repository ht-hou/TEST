package com.t.ud.controller;

import com.t.ud.service.UDService;
import com.t.ud.utils.FileControl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@Api(tags = "上传下载")
@RestController
public class FileController {

    @Resource
    UDService udService;
    @ApiOperation(value = "查询当前文件列表",notes = "查询文件列表",httpMethod = "GET")
    @RequestMapping("/selectAll")
    public List<String> getAll() {
        return udService.getAll();
    }

    //使用默认路径
    @ApiOperation(value = "上传文件",notes = "使用默认地址上传文件",httpMethod = "POST")
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
    @ApiOperation(value = "上传文件",notes = "使用指定地址上传文件",httpMethod = "POST")
    public String uploadPlace(MultipartFile file,String path) throws Exception {
        udService.upload(file, path);

        return null;
    }

    //下载
    @RequestMapping(value = "/download/file")
    @ApiOperation(value = "下载文件",notes = "下载文件",httpMethod = "GET")
    public String downloadFile(@RequestParam String fileName, HttpServletResponse response) throws IOException {

        udService.download(response, fileName);

        return null;
    }
}