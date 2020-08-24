package com.application.tourist.controller;

import com.application.tourist.entity.City;
import com.application.tourist.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CityController {

    @Autowired
    private CityService service;
    @PostMapping("/addCity")
    public City addCity(@RequestBody City city){


        return service.saveCity(city);
    }
    @GetMapping("/cities")
    public List<City> findAllCities(){


        return service.getCities();
    }
    @GetMapping("/city/{id}")
    public City findCityById(@PathVariable String id){


        return service.getCityById(id);
    }
    @PutMapping("/updateCity")
    public City updateCity(@RequestBody City city){
        return service.updateCity(city);

    }
    @DeleteMapping("/deleteCity/{id}")
    public String deleteCity(@PathVariable  String id){


        return service.deleteCity(id);
    }
}
