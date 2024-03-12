package com.example.demo.client;

import feign.Headers;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "carsClient", url = "https://car-data.p.rapidapi.com/cars/")
public interface CarsClient {


    @GetMapping("makes")
    @Headers({ "X-RapidAPI-Key: 42293dc535msh5d2aefd8da94054p164730jsn8fc2847be14a",
            "X-RapidAPI-Host: car-data.p.rapidapi.com" })
    String makes();
}
