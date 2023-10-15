package com.geekster.InstagramBasicDesign.Service;

import com.geekster.InstagramBasicDesign.Model.AuthenticationToken;
import com.geekster.InstagramBasicDesign.Model.User;
import com.geekster.InstagramBasicDesign.Repo.AuthenticationTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;

@Service
public class AuthenticationService {
    @Autowired
    AuthenticationTokenRepo authenticationToken;
}