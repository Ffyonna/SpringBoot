package com.netflixapi.demo.Services;

import com.netflixapi.demo.Models.Category;
import com.netflixapi.demo.Repositories.CategoryRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryImpl implements CategoryService
{
    private final CategoryRepo categoryRepo;

    public CategoryImpl(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public Category createNewCategory(Category category) {
        return categoryRepo.save(category);
    }

    @Override
    public List<Category> findAll()
    {
        return categoryRepo.findAll();
    }
}
