package com.blog.repository;

import com.blog.base.BasicRepository;
import com.blog.domain.User;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by jim on 17-7-8.
 */
public interface UserRepository extends BasicRepository<User, String> {

    @Query("select u from User u where 1 = 1")
    List<User> findAlls();
}
