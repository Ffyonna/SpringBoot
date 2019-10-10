package com.netflixapi.demo.Repositories;

import com.netflixapi.demo.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
