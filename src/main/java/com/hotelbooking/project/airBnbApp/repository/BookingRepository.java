package com.hotelbooking.project.airBnbApp.repository;

import com.hotelbooking.project.airBnbApp.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
