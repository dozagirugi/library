package com.mysite.library.User;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class userInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idx;
    private String name;

    @Column(unique=true)
    private String email;
    private String password;
    private String phone;
    private String address;
}
