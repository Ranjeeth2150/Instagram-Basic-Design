package com.geekster.InstagramBasicDesign.Controller;

import com.geekster.InstagramBasicDesign.Service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @Autowired
    AuthenticationService authenticationService;

}