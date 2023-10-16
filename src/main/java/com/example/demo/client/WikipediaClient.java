package com.example.demo.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "wikipediaClient", url = "https://az.wikipedia.org/wiki")
public interface WikipediaClient {


    @GetMapping("/{articleName}")
    String vikipediaData(@PathVariable("articleName") String articleName);

}
