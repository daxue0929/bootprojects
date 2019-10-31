package com.daxue.first.services;

import com.daxue.first.base.services.BaseServices;
import com.daxue.first.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService extends BaseServices {
    List<User> getList();
}
