package com.netflixapi.demo.Models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "categories")
public class Category
{
    @Id
    @NotNull(groups = Create.class)
    @Column(name = "categoryId")
    private int categoryId;

    @NotNull (groups = Create.class)
    @Column (name = "categoryName")
    private String categoryName;

    public Category() {
    }

    public Category(int categoryId, String categoryName)
    {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }

        @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movies movies;

    public Category(Movies movies) {
        this.movies = movies;
    }

    public Movies getMovies() {
        return movies;
    }

    public void setMovies(Movies movies) {
        this.movies = movies;
    }

    public interface Update{}
    public interface Create{}
}
