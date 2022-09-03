package com.api.UserRegister.controllers;

import com.api.UserRegister.repositories.UserRepositorie;

public class UserController {

    public List<User> findUsers(){
        UserRepositorie repository = new UserRepositorie();
        return repository.findAll();
    }

}
