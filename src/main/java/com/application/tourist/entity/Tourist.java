package com.application.tourist.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.awt.*;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="TOURIST_TABLE")
public class Tourist {

    @Id
    @Column
    private String Id;
    @Column
    private String Name;

    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    @Column
    private String dob;

    @Column
    private String idType;
    @Column
    private Integer travelFrequency;
    @Column
    private Double estimate;
    @Column
    private String destiny;
    @Column
    private Boolean creditCard;

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

    public String getDob() {        return dob;    }

    public void setDob(String dob) {        this.dob = dob;    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public Integer getTravelFrequency() {
        return travelFrequency;
    }

    public void setTravelFrequency(Integer travelFrequency) {
        this.travelFrequency = travelFrequency;
    }

    public Double getEstimate() {
        return estimate;
    }

    public void setEstimate(Double estimate) {
        this.estimate = estimate;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public Boolean isCreditCard() {        return creditCard;    }

    public void setCreditCard(Boolean creditCard) {
        this.creditCard = creditCard;
    }
}