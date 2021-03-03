package com.ex.yh.Service;

import com.ex.yh.pojo.TResourceData;

import java.util.List;

public interface YHService {

    List<TResourceData> setAll();

    List<TResourceData> getAll();

    TResourceData getOne(String rdid);
}
