package com.example.proxyservice;

import org.apache.http.HttpStatus;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import com.netflix.discovery.shared.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
public class Controller {

    private final DiscoveryClient discoveryClient;

    public Controller(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }
    @GetMapping(path="/users")
    private ResponseEntity<String> getUsers() {
        List<ServiceInstance> list = discoveryClient.getInstances("userservice");
        if (list != null && list.size() > 0 ) {
            RestTemplate restTemplate = new RestTemplate();
            String result =  restTemplate.getForObject(list.get(0).getUri()+"/users", String.class);
            return new ResponseEntity<>(result,null, HttpStatus.SC_OK);
            }

            return new ResponseEntity<>(null,null, HttpStatus.SC_NOT_FOUND);
        }

    }

