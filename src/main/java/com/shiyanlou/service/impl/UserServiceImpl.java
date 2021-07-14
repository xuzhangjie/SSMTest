package com.shiyanlou.service.impl;

import com.shiyanlou.mapper.UserMapper;
import com.shiyanlou.model.User;
import com.shiyanlou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    public UserMapper userMapper;

    // 下面是 UserService 接口所有方法的具体实现
    public User login(User user) {
            if(userMapper==null){
                System.out.println("userMapper是空指针");
            }
        return userMapper.selectLogin(user);
    }

    public List<User> selectAllUser() {

        return userMapper.selectAllUser();
    }

    public void addUser(User user) {
        userMapper.addUser(user);
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }

}
