package com.geekster.InstagramBasicDesign.Service;

import com.geekster.InstagramBasicDesign.Model.AuthenticationToken;
import com.geekster.InstagramBasicDesign.Model.User;
import com.geekster.InstagramBasicDesign.Repo.IUserRepo;

import com.geekster.InstagramBasicDesign.Service.hasingUtility.PasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public interface UserService {
    User createUser(User user);
    User signIn(String email, String password) throws Exception;
    User updateUser(User user);
}