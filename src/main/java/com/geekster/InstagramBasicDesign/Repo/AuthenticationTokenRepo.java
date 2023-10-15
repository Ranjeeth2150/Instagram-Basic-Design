package com.geekster.InstagramBasicDesign.Repo;

import com.geekster.InstagramBasicDesign.Model.AuthenticationToken;
import com.geekster.InstagramBasicDesign.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationTokenRepo extends JpaRepository<AuthenticationToken,Long> {
}
