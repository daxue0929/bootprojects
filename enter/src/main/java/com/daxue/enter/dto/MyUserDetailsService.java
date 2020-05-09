//package com.daxue.enter.dto;
//
//
//
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.daxue.enter.entity.User;
//import com.daxue.enter.mapper.RoleMapper;
//import com.daxue.enter.mapper.UserMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import java.util.List;
//
//public class MyUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private UserMapper userMapper;
//    @Autowired
//    private RoleMapper roleMapper;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        QueryWrapper<User> users = new QueryWrapper<>();
//        users.lambda().eq(User::getName, users);
////        User user = new User();
//        List<User> usersResult = userMapper.selectList(users);
//        return usersResult.get(0);
//    }
//}
