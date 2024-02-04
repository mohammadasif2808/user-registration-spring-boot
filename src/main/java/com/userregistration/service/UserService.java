package com.userregistration.service;

import com.userregistration.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void save(User user);

    User findByUsername(String Username);
}
