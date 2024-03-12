package com.example.demo.controller;

import com.example.demo.client.CompanyApi;
import com.example.demo.domain.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {


    @Autowired
    private CompanyApi companyApi;


    @RequestMapping(value = "/companyinfo")
    public ResponseEntity<?> companyInfo() {
        Company company = companyApi.companyInfo();

        return new ResponseEntity<>(company.getCeo(), HttpStatus.OK);

    }




}
