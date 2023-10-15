package com.geekster.InstagramBasicDesign.Service;

import com.geekster.InstagramBasicDesign.Model.Post;
import com.geekster.InstagramBasicDesign.Model.User;
import com.geekster.InstagramBasicDesign.Repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PostService {
    Post savePost(Post post);
    List<Post> getPostsByUser(User user);
}
