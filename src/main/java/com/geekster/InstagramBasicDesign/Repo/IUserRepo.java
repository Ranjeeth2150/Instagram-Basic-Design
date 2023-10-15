package com.geekster.InstagramBasicDesign.Repo;

import com.geekster.InstagramBasicDesign.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface IUserRepo extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);
}
