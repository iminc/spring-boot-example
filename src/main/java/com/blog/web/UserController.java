package com.blog.web;

import com.blog.domain.User;
import com.blog.service.UserService;
import com.google.common.base.Strings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * Created by jim on 17-7-8.
 */

@Slf4j
@RestController
public class UserController {

    @Autowired UserService userService;

    @RequestMapping("/")
    String home() {
        System.out.println(Strings.isNullOrEmpty("123"));
        return "hello word.";
    }

    @RequestMapping("/{id}")
    String user(@PathVariable("id") User user) {
        System.out.println(user);
        System.out.println(userService.findAlls());
        return String.format("hello word %s.", user.getName());
    }

    @RequestMapping("/test")
    List<User> test() throws IOException {
        User user = new User();
        user.setAccount("ifzm");
        user.setPassword("123456");
        user.setName("ifzm");
        user.setAge(18);
        user.setSex("1");

        // userService.save(user);
        System.out.println(user.getId());
        System.out.println(userService.count());
        return userService.findAlls();
    }
}
