package com.example.userservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @GetMapping(path = "/users")
    public ResponseEntity<String> getUsers(){
        return new ResponseEntity<>("Giolanda, Mary, George",null, HttpStatus.OK);
    }

}
