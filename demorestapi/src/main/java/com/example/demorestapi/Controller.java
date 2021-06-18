package com.example.demorestapi;

import org.apache.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
    @GetMapping (path ="/")
    public ResponseEntity<String> getUsers(){
        RestTemplate restTemplate =new RestTemplate();
        String result =  restTemplate.getForObject("http://localhost:8030/users", String.class);
        System.out.println(result.toString());
        if (result != null) {
            return new ResponseEntity<>(result, null, HttpStatus.SC_OK);
        }
        return new  ResponseEntity<>(null,null,HttpStatus.SC_NOT_FOUND);
        }

}
