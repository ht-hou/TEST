package com.ex.user.Service;

import com.ex.user.entity.DTO.MohuDto;
import com.ex.user.entity.DTO.UserDto;
import com.ex.user.entity.OrgUser;
import com.github.pagehelper.PageInfo;

public interface UserService {

    PageInfo getAll(int pageNum, int pageSize);

    void insertOne(UserDto user);

    void updateOne(UserDto user);

    void deleteOne(String userid);

    void getSome(MohuDto mohuDto);
}
