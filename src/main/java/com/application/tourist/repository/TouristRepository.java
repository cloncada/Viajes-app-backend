package com.application.tourist.repository;

import com.application.tourist.entity.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TouristRepository extends JpaRepository<Tourist, String> {


}
