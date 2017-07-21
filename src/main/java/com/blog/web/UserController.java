package com.blog.web;

import com.blog.domain.User;
import com.blog.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by jim on 17-7-8.
 */

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    User addUser() {
        User user = new User();
        user.setUsername("ifzm");
        user.setPassword("123456");
        user.setEmail("admin@ifzm.cn");
        user.setLastPasswordResetDate(new Date());
        return userService.save(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    User delUser(@PathVariable("id") User user) {
        userService.delete(user);
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User getUser(@PathVariable("id") User user) {
        return user;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(method = RequestMethod.GET)
    List<User> getUsers() throws IOException {
        return userService.findAlls();
    }
}
