package com.example.demo.client;

import com.example.demo.copartDto.CopartRoot;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "copartApiClient", url = "https://api.apicar.store/public/docs/current_lots.json")
public interface CopartApiClient {

    @GetMapping()
    CopartRoot getCars();


}
