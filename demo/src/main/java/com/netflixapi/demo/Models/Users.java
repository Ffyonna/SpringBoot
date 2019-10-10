package com.netflixapi.demo.Models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")

public class Users
{
    @Id
    //@GeneratedValue (strategy = GenerationType.AUTO)
    @NotNull (groups = Create.class)
    @Column(name = "userId")
    private int userId;

    @NotNull(groups = Create.class)
    @Column(name = "userName")
    private String userName;


    public Users() {
    }

    public Users(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @ManyToMany
    @JoinTable(name = "user_movie_id", joinColumns = {@JoinColumn(name = "user_id")}, inverseJoinColumns = {@JoinColumn(name = "movie_id")})

    @Override
    public String toString()
    {
        return "Users{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }

    public interface Create{}
}
