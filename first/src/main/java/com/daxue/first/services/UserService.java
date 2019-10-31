package com.daxue.first.services;

import com.daxue.first.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    List<User> getList();
}
