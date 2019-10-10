package com.netflixapi.demo.Services;

import com.netflixapi.demo.Models.Category;

import java.util.List;

public interface CategoryService
{
    Category createNewCategory(Category category);
    List<Category> findAll();

}
