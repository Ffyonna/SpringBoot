package com.netflixapi.demo.Services;

import com.netflixapi.demo.Models.Users;
import com.netflixapi.demo.Repositories.UsersRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersImpl implements UsersService
{
    private final UsersRepo usersRepo;

    public UsersImpl(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }

    @Override
    public List<Users> findAll()
    {
        return usersRepo.findAll();
    }

    @Override
    public Users createUser(Users users) {
        return usersRepo.save(users);
    }
}
