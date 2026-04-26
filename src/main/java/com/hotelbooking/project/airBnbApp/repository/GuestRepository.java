package com.hotelbooking.project.airBnbApp.repository;

import com.hotelbooking.project.airBnbApp.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}
