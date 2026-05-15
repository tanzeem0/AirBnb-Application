package com.hotelbooking.project.airBnbApp.service;

import com.hotelbooking.project.airBnbApp.dto.ProfileUpdateRequestDto;
import com.hotelbooking.project.airBnbApp.dto.UserDto;
import com.hotelbooking.project.airBnbApp.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();

}
