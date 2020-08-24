package com.application.tourist.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="City_TABLE")
public class City {

    @Id
    @Column
    private String Id;
    @Column
    private String Name;
    @Column
    private Integer population;
    @Column
    private String touristicSite;
    @Column
    private String bestHotel;


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getTouristicSite() {
        return touristicSite;
    }

    public void setTouristicSite(String touristicSite) {
        this.touristicSite = touristicSite;
    }

    public String getBestHotel() {
        return bestHotel;
    }

    public void setBestHotel(String bestHotel) {
        this.bestHotel = bestHotel;
    }
}
