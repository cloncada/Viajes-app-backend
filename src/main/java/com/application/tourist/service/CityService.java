package com.application.tourist.service;

import com.application.tourist.entity.City;
import com.application.tourist.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository repository;

    public City saveCity(City city) {
       return repository.save(city);
    }
    public List<City> getCities(){

        return repository.findAll();

    }
    public City getCityById(String id){

        return repository.findById(id).orElse(null);

    }
    public String deleteCity(String id){
        repository.deleteById(id);
        return "removed "+id;


    }
    public City updateCity(City city){

        City existingCity=repository.findById(city.getId()).orElse(null);
        existingCity.setName(city.getName());
        existingCity.setBestHotel(city.getBestHotel());
        existingCity.setPopulation(city.getPopulation());
        existingCity.setTouristicSite(city.getTouristicSite());

       return repository.save(city);


    }
}
