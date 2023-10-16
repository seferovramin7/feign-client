package com.example.demo.client;

import com.example.demo.domain.Company;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "spaceXApiClient", url = "https://api.spacexdata.com/v2")
public interface CompanyApi {

    @GetMapping("info")
    Company companyInfo();


}
