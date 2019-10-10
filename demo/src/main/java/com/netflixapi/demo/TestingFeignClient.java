package com.netflixapi.demo;

import com.netflixapi.demo.Models.Category;
import com.netflixapi.demo.Models.Movies;
import com.netflixapi.demo.Models.Users;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestingFeignClient implements CommandLineRunner
{
    private final FeignRestClient feignRestClient;


    public TestingFeignClient(FeignRestClient feignRestClient)
    {
        this.feignRestClient = feignRestClient;
    }

    @Override
    public void run(String... args) throws Exception
    {
//        Movies createNewMovie = feignRestClient.createMovie(new Movies(12, "Deep Blue Sea", 8, "Adventure", "Suggested"));
//        System.out.println("The movie created is: " + createNewMovie);
//
//        Category createNewCategory = feignRestClient.createCategory(new Category(78, "Comedy"));
//        System.out.println("The new category is: " + createNewCategory);
//
//        Users createNewUser = feignRestClient.createUser(new Users(45, "Fiona"));
//        System.out.println("The new user is: " + createNewUser);
//
//        List<Users> users = feignRestClient.getAllUsers();
//        System.out.println("All users are: " + users.toString());
//
//        List<Category> categories = feignRestClient.getAllCategories();
//        System.out.println("All categories are: " + categories.toString());
//
//        List<Movies> movies = feignRestClient.getAllMovies();
//        System.out.println("All movies are: " + movies.toString());
    }
}
