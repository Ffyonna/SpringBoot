package com.netflixapi.demo.Services;

import com.netflixapi.demo.Models.Users;

import java.util.List;

public interface UsersService
{
    List<Users> findAll();


    Users createUser(Users users);
}
