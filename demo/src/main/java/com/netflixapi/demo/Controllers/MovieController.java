package com.netflixapi.demo.Controllers;

import com.netflixapi.demo.Models.Movies;
import com.netflixapi.demo.Services.MovieService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movies", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class MovieController
{
    private final MovieService movieService;


    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public Movies createMovie(@RequestBody Movies movies)
    {
        return movieService.createNewMovie(movies);
    }

    @GetMapping
    public List<Movies> findAll()
    {
        return movieService.findAll();
    }
}
