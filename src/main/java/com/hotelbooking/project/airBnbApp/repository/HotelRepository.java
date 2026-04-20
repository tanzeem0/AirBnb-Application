package com.hotelbooking.project.airBnbApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hotelbooking.project.airBnbApp.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long> {

}
