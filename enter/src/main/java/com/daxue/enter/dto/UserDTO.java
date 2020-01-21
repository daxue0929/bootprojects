package com.daxue.enter.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.daxue.enter.entity.Role;
import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Data
@Component
@TableName(value = "base.user")
public class UserDTO implements UserDetails, Serializable {

    public Integer id;

    public String name;

    public Integer age;

    public String password;

    private List<Role> authorities;


    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return true;
    }
}
