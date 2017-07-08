package com.blog.repository;

import com.blog.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * Created by jim on 17-7-8.
 */
public interface UserRepository extends BasicRepository<User, String> {

}
