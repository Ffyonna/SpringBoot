package com.netflixapi.demo.Services;

import com.netflixapi.demo.Models.Movies;

import java.util.List;

public interface MovieService
{
    Movies createNewMovie (Movies movies);

    List<Movies> findAll();
}
