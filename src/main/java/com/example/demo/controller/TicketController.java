package com.example.demo.controller;

import com.example.demo.client.TicketClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TicketController {


    @Autowired
    private TicketClient ticketClient;


    @RequestMapping(value = "/ticket/{q}")
    public ResponseEntity<?> wikipediaInfo(@PathVariable String q) {
        String s = ticketClient.searchEvents(q);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }
}
