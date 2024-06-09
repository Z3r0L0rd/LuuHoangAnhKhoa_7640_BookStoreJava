package com.example.LuuHoangAnhKhoa.services;

import com.example.LuuHoangAnhKhoa.entity.User;
import com.example.LuuHoangAnhKhoa.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;
    public void save(User user) {
        userRepository.save(user);
    }
}
