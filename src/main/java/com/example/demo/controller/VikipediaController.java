package com.example.demo.controller;

import com.example.demo.client.WikipediaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VikipediaController {


    @Autowired
    private WikipediaClient wikipediaClient;


    @RequestMapping(value = "/viki/{name}")
    public ResponseEntity<?> wikipediaInfo(@PathVariable String name){
        String vikipediaData = wikipediaClient.vikipediaData(name);
        return new ResponseEntity<>(vikipediaData,HttpStatus.OK);
    }
}
