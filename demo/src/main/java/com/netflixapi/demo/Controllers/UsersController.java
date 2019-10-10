package com.netflixapi.demo.Controllers;

import com.netflixapi.demo.Models.Users;
import com.netflixapi.demo.Services.UsersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UsersController
{
    private final UsersService usersService;

    public UsersController(UsersService usersService)
    {
        this.usersService = usersService;
    }

    @PostMapping
    public Users createUser(@RequestBody Users users)
    {
        return usersService.createUser(users);
    }

    @GetMapping
    public List<Users> findAll()
    {
        return usersService.findAll();
    }
}
