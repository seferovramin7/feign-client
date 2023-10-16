package com.example.demo;

import com.example.demo.client.CopartApiClient;
import com.example.demo.copartDto.CopartCar;
import com.example.demo.copartDto.CopartRoot;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CopartController {


    @Autowired
    private CopartApiClient copartApiClient;


    @RequestMapping(value = "/copart")
    public ResponseEntity<?> companyInfo() {

        CopartRoot copartRoot = copartApiClient.getCars();
        ArrayList<CopartCar> cars = copartRoot.getData();
        ArrayList<CopartCar> result = new ArrayList<>();

        for (CopartCar car : cars) {
            if (car.getMake().equals("Mazda") && car.getModel().equals("CX-5") &&
                    car.getOdometer() < 19457) {
                result.add(car);
            }
        }


        return new ResponseEntity<>(result, HttpStatus.OK);

    }


}
