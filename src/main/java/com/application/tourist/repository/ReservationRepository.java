package com.application.tourist.repository;

import com.application.tourist.entity.Reservation;
import com.application.tourist.entity.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, String> {

List<Reservation> findByDateAndCity(String date, String cityName);
List<Reservation> findByTouristId(String touristId);
List<Reservation>findByCity(String cityName);
}
