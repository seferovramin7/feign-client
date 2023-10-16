package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class CarDto {
    @JsonProperty("MyArray")
   public ArrayList<String> myArray;
}