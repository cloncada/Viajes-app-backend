package com.application.tourist.service;

import com.application.tourist.entity.Tourist;
import com.application.tourist.repository.TouristRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {
    @Autowired
    private TouristRepository repository;

    public Tourist saveTourist(Tourist tourist) {
       return repository.save(tourist);
    }
    public List<Tourist> getTourists(){

        return repository.findAll();

    }
    public Tourist getTouristById(String id){

        return repository.findById(id).orElse(null);

    }
    public String deleteTourist(String id){
        repository.deleteById(id);
        return "removed "+id;


    }
    public Tourist updateTourist(Tourist tourist){

        Tourist existingTourist=repository.findById(tourist.getId()).orElse(null);
        existingTourist.setName(tourist.getName());
        existingTourist.setDestiny(tourist.getDestiny());
       existingTourist.setEstimate(tourist.getEstimate());
       existingTourist.setId(tourist.getId());
       existingTourist.setDob(tourist.getDob());
       existingTourist.setCreditCard(tourist.isCreditCard());
       return repository.save(existingTourist);


    }
}
