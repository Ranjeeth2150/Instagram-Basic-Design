package com.geekster.InstagramBasicDesign.Repo;

import com.geekster.InstagramBasicDesign.Model.Post;
import com.geekster.InstagramBasicDesign.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface PostRepo extends JpaRepository<Post,Long>
{
    List<Post> findByUser(User user);

}
