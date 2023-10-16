package com.example.demo;

import com.example.demo.client.CarsClient;
import com.example.demo.domain.CarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class CarsController {


    @Autowired
    private CarsClient carsClient;


    @RequestMapping(value = "/cars")
    public ResponseEntity<?> wikipediaInfo() {

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Key", "42293dc535msh5d2aefd8da94054p164730jsn8fc2847be14a");
        headers.set("X-RapidAPI-Host", "car-data.p.rapidapi.com");

        HttpEntity<String> entity = new HttpEntity<>("body", headers);

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> exchange = restTemplate.exchange(
                "https://car-data.p.rapidapi.com/cars/makes",
                HttpMethod.GET, entity, String.class);

        return new ResponseEntity<>(exchange.getBody(), HttpStatus.OK);

    }
}
