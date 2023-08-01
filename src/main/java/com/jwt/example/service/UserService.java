package com.jwt.example.service;

import com.jwt.example.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store=new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Nishant Rawal","rawaln19@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"tech coder","tech.dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"tech gamer","techgamer.dev.in"));
    }

    public List<User> getUsers(){
        return  this.store;
    }
}
