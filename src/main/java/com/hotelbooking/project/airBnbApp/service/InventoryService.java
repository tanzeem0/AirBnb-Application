package com.hotelbooking.project.airBnbApp.service;

import com.hotelbooking.project.airBnbApp.dto.HotelDto;
import com.hotelbooking.project.airBnbApp.dto.HotelSearchRequest;
import com.hotelbooking.project.airBnbApp.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
