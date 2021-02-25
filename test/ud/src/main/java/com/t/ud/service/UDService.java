package com.t.ud.service;



import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public interface UDService {
    void upload(MultipartFile file, String baseDir) throws Exception;

    void download(HttpServletResponse response , String newName) throws IOException;

    List<String> getAll();
}