package com.netflixapi.demo.Controllers;

import com.netflixapi.demo.Models.Category;
import com.netflixapi.demo.Services.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/categories")
public class CategoryController
{
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService)
    {
        this.categoryService = categoryService;
    }

    @PostMapping
    public Category createCategory(@RequestBody Category category)
    {
        return categoryService.createNewCategory(category);
    }

    @GetMapping
    public List<Category>findAll()
    {
        return categoryService.findAll();
    }
}
