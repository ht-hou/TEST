package com.t.ud.mapper;

import com.t.ud.pojo.UDMas;

import java.util.List;

public interface UDMapper  {

    List<String> selectAllFileName();

     void insert(UDMas uploadEntity) ;

    UDMas selectOne(String newName);

    void deleteById(Long fileId);
}
