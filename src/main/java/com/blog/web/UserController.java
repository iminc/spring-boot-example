package com.blog.web;

import com.blog.domain.User;
import com.alibaba.fastjson.JSON;
import com.google.common.base.Strings;
import com.blog.utils.CommonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by jim on 17-7-8.
 */

@Slf4j
@RestController
public class UserController {

    @RequestMapping("/{name}")
    String user(@PathVariable String name) {
        return String.format("hello word %s.", name);
    }

    @RequestMapping("/")
    String home() {
        System.out.println(Strings.isNullOrEmpty("123"));
        return "hello word.";
    }

    @RequestMapping("/test")
    User test() throws IOException {
        User user = new User();
        user.setId(CommonUtil.UUID());
        user.setAccount("ifzm");
        user.setPassword("123456");
        user.setName("ifzm");
        user.setAge(18);
        user.setSex("1");

        System.out.println(JSON.toJSONString(user));
        return user;
    }
}
