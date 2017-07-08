package com.blog.service;

import com.blog.base.BasicService;
import com.blog.domain.User;

import java.util.List;

/**
 * Created by jim on 17-7-8.
 */
public interface UserService extends BasicService<User, String> {

    List<User> findAlls();
}
