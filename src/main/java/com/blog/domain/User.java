package com.blog.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jim on 17-7-6.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "SYSTEM_USER")
public class User implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 32)
    String id;

    @Column(length = 50)
    String account;

    @Column(length = 16)
    String password;

    @Column(length = 200)
    String name;

    @Column(length = 10)
    Integer age;

    @Column(length = 1)
    String sex;
}
