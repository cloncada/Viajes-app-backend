package com.application.tourist.controller;

import com.application.tourist.entity.City;
import com.application.tourist.entity.Reservation;
import com.application.tourist.service.CityService;
import com.application.tourist.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ReservationController {

    @Autowired
    private ReservationService service;
    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation reservation){


        return service.addReservation(reservation);
    }
    @GetMapping("/reservationsCity/{cityName}")
    public List<Reservation> findAllByCityName(@PathVariable String cityName){


        return service.getReservationByName(cityName);
    }
    @GetMapping("/reservationsTourist/{id}")
    public List<Reservation> findCityByTouristId(@PathVariable String id){


        return service.getReservationByTouristId(id);
    }
    @GetMapping("/reservations/{name}/{date}")
    public List<Reservation> getReservationByNameAndDate(@PathVariable("name") String name, @PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) String date){
        return service.getReservationByNameAndDate(date,name);

    }
}
