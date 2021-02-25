package com.t.ud.service.impl;



import com.t.ud.mapper.UDMapper;
import com.t.ud.pojo.UDMas;
import com.t.ud.service.UDService;
import com.t.ud.utils.FileUploadUtils;
import com.t.ud.utils.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;


@Service
public class UDServiceImpl implements UDService {
    @Resource
    UDMapper udMapper;

    @Override
    public void upload(MultipartFile file, String baseDir) throws Exception {
        //就算什么也不传，controller层的file也不为空，但是originalFilename会为空（亲测）
        String originalFilename = file.getOriginalFilename();
        System.out.println(originalFilename);
        if (originalFilename == null || "".equals(originalFilename)) {
            throw new Exception("上传文件不能为空");
        }
        //检测是否上传过同样的文件，如果有的话就删除。（这边可根据个人的情况修改逻辑）
//        QueryWrapper<UDMas> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("old_name", originalFilename);
    UDMas oldEntity = udMapper.selectOne(originalFilename);

        //新的文件
        UDMas uploadEntity = new UDMas();
        uploadEntity.setCreateTime(new Date());
        uploadEntity.setUpdateTime(new Date());
        uploadEntity.setFileName(originalFilename);
        String fileLocation = null;
        if (baseDir != null) {
            fileLocation = FileUploadUtils.upload(baseDir, file);
        } else {
            fileLocation = FileUploadUtils.upload(file);
        }

        uploadEntity.setFilePath(fileLocation);
        System.out.println(fileLocation);
        udMapper.insert(uploadEntity);

       if (oldEntity != null) {
            //确保新的文件保存成功后，删除原有的同名文件(实体文件 and 数据库文件)
            FileUtils.deleteFile(oldEntity.getFilePath());
          udMapper.deleteById(oldEntity.getFileId());
       }
    }

    @Override
    public void download(HttpServletResponse response, String newName) throws IOException {
       // QueryWrapper<UDMas> queryWrapper = new QueryWrapper<>();
       // queryWrapper.eq("name", newName);
        UDMas uploadEntity = udMapper.selectOne(newName);

        response.setHeader("content-type", "application/octet-stream");
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(uploadEntity.getFileName(), "UTF-8"));
        FileUtils.writeBytes(uploadEntity.getFilePath(), response.getOutputStream());
    }

    @Override
    public List<String> getAll() {
        List<String> strings = udMapper.selectAllFileName();
        return strings;
    }

}

