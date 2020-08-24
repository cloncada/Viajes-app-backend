package com.application.tourist.service;

import com.application.tourist.entity.City;
import com.application.tourist.entity.Reservation;
import com.application.tourist.repository.CityRepository;
import com.application.tourist.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository repository;

    public Reservation addReservation(Reservation reservation){


        return repository.save(reservation);
    }
    public List<Reservation> getReservationByName(String name){

        return repository.findByCity(name);

    }
    public List<Reservation> getReservationByTouristId(String id){

        return repository.findByTouristId(id);

    }

    public List<Reservation> getReservationByNameAndDate(String date, String name){

        return repository.findByDateAndCity(date ,name);

    }





}
