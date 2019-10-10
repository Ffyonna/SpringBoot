package com.netflixapi.demo.Repositories;

import com.netflixapi.demo.Models.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<Movies, Long> {
}
