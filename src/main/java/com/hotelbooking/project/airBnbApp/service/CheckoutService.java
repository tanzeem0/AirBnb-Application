package com.hotelbooking.project.airBnbApp.service;

import com.hotelbooking.project.airBnbApp.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}

