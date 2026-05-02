package com.hotelbooking.project.airBnbApp.strategy;

import com.hotelbooking.project.airBnbApp.entity.Inventory;

import java.math.BigDecimal;

public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
