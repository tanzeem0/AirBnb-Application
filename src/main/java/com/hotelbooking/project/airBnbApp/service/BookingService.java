package com.hotelbooking.project.airBnbApp.service;

import com.hotelbooking.project.airBnbApp.dto.BookingDto;
import com.hotelbooking.project.airBnbApp.dto.BookingRequest;
import com.hotelbooking.project.airBnbApp.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
