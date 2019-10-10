package com.netflixapi.demo;


import com.netflixapi.demo.Models.Category;
import com.netflixapi.demo.Models.Movies;
import com.netflixapi.demo.Models.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "FeignBoss", url = "http://localhost:8000", configuration = FeignConfig.class)
public interface FeignRestClient
{
    @RequestMapping(method = RequestMethod.POST, value = "/movies")
    Movies createMovie(@RequestBody Movies movies);

    @RequestMapping(method = RequestMethod.POST, value = "/categories")
    Category createCategory(@RequestBody Category category);

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    Users createUser(@RequestBody Users users);

    @RequestMapping(method = RequestMethod.GET, value = "/users")
    List<Users> getAllUsers();

    @RequestMapping(method = RequestMethod.GET, value = "/categories")
    List<Category> getAllCategories();

    @RequestMapping(method = RequestMethod.GET, value = "/movies")
    List<Movies> getAllMovies();

}
