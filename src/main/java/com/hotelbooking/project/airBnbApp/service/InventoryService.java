package com.hotelbooking.project.airBnbApp.service;

import com.hotelbooking.project.airBnbApp.entity.Room;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);

}
