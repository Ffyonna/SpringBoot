package com.netflixapi.demo.Repositories;

import com.netflixapi.demo.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users, Long> {
}
