package com.blog.service.impl;

import com.blog.base.BasicRepository;
import com.blog.base.AbstractBasicService;
import com.blog.domain.User;
import com.blog.repository.UserRepository;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by jim on 17-7-8.
 */

@Service
@Transactional
public class UserServiceImpl extends AbstractBasicService<User, String> implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public BasicRepository<User, String> registryRepository() {
        return userRepository;
    }

    @Override
    public List<User> findAlls() {
        return userRepository.findAlls();
    }
}
