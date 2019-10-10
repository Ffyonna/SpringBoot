package com.netflixapi.demo.Services;

import com.netflixapi.demo.Models.Movies;
import com.netflixapi.demo.Repositories.MovieRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesImpl implements MovieService
{

    private final MovieRepo movieRepo;
    //private final MovieService movieService;

    public MoviesImpl(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
        //this.movieService = movieService;
    }

    @Override
    public Movies createNewMovie(Movies movies) {

        return movieRepo.save(movies);
    }

    @Override
    public List<Movies> findAll() {
        return movieRepo.findAll();
    }
}
