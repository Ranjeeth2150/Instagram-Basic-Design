package com.geekster.InstagramBasicDesign.Service;

import com.geekster.InstagramBasicDesign.Model.User;
import com.geekster.InstagramBasicDesign.Repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    IUserRepo userRepo;

    @Override
    public User createUser(User user) {
        // You might want to add validation logic here
        return userRepo.save(user);
    }

    @Override
    public User signIn(String email, String password) throws Exception {
        Optional<User> userOptional = userRepo.findByEmail(email);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            // Assuming there's a password field in User model
            if (user.getPassword().equals(password)) {
                return user;
            }
        }

        throw new Exception("Invalid email or password"); // You should create this exception class
    }

    @Override
    public User updateUser(User user) {
        // You might want to add validation logic here
        return userRepo.save(user);
    }
}