package com.netflixapi.demo.Models;

import org.hibernate.sql.Update;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "movies")
public class Movies
{

    @Id
    @NotNull (groups = Update.class)
    @Column(name = "movieId")
    private int movieId;

    @NotNull (groups = Create.class)
    @Column (name = "movieName")
    private String movieName;

    @NotNull (groups = Create.class)
    @Column (name = "movieCategory")
    private String movieCategory;

    @NotNull (groups = Create.class)
    @Column (name = "categoryId")
    private int categoryId;

    @NotNull (groups = Create.class)
    @Column (name = "movieType")
    private String movieType;

    public Movies() {
    }

    public Movies(int movieId, String movieName, int categoryId, String movieCategory, String movieType) {
        this.movieName = movieName;
        this.movieCategory = movieCategory;
        this.movieType = movieType;
        this.movieId = movieId;
        this.categoryId = categoryId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(String movieCategory) {
        this.movieCategory = movieCategory;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setType(String movieType) {
        this.movieType = movieType;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @OneToMany(mappedBy = "movies")
    private List<Category> categories;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @ManyToMany
    private List<Users> users;

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieCategory='" + movieCategory + '\'' +
                ", categoryId=" + categoryId +
                ", movieType='" + movieType + '\'' +
                '}';
    }

    public interface Update{}
    public interface Create{}
}
