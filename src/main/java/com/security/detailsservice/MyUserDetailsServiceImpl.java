package com.security.detailsservice;

import com.security.domain.entity.User;
import com.security.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Slf4j
@Component
public class MyUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("账号：{} 开始尝试登录",username);
        User user = userMapper.selectByUsername(username);
        if (user == null) {
            log.info("账号：{} 登录失败",username);
            throw new UsernameNotFoundException("用户名或者密码错误");
        }
        org.springframework.security.core.userdetails.User securityUser =
                new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),new ArrayList<>());
        return securityUser;
    }
}
