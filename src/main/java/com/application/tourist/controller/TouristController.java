package com.application.tourist.controller;

import com.application.tourist.entity.Tourist;
import com.application.tourist.service.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TouristController {

    @Autowired
    private TouristService service;
    @PostMapping("/addTourist")
    public Tourist addTourist(@RequestBody Tourist tourist){


        return service.saveTourist(tourist);
    }
    @GetMapping("/tourists")
    public List<Tourist> findAllTourist(){


        return service.getTourists();
    }
    @GetMapping("/tourists/{id}")
    public Tourist findTouristById(@PathVariable String id){


        return service.getTouristById(id);
    }
    @PutMapping("/update")
    public Tourist updateTourist(@RequestBody Tourist tourist){
        return service.updateTourist(tourist);

    }
    @DeleteMapping("/delete/{id}")
    public String deleteTourist(@PathVariable  String id){


        return service.deleteTourist(id);
    }
}
