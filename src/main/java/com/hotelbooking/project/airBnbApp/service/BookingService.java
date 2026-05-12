package com.hotelbooking.project.airBnbApp.service;

import com.hotelbooking.project.airBnbApp.dto.BookingDto;
import com.hotelbooking.project.airBnbApp.dto.BookingRequest;
import com.hotelbooking.project.airBnbApp.dto.GuestDto;
import com.stripe.model.Event;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);

    String initiatePayments(Long bookingId);

    void capturePayment(Event event);

    void cancelBooking(Long bookingId);

    String getBookingStatus(Long bookingId);
}
