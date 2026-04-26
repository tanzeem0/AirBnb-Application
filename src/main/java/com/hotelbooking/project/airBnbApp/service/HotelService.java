package com.hotelbooking.project.airBnbApp.service;

import com.hotelbooking.project.airBnbApp.dto.HotelDto;
import com.hotelbooking.project.airBnbApp.dto.HotelInfoDto;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHotelById(Long id);

    void activateHotel(Long hotelId);

    HotelInfoDto getHotelInfoById(Long hotelId);
}
