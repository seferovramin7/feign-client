package com.example.demo.client;

import feign.Headers;
import feign.Param;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ticketClient", url = "https://api.iticket.az")
public interface TicketClient {


    @GetMapping("/en/v5/events/search?client=web&q={query}")
    String searchEvents(@Param("query") String query);

}
