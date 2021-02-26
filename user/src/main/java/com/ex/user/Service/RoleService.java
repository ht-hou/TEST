package com.ex.user.Service;

import com.ex.user.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllByDepId(String createdepid);
}
