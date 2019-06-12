package com.julianrios.cherry.service;

import com.julianrios.cherry.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * A service to handle incoming request from the client to the profile server.
 * This service communicates request to the server and returns response to the Profile Controller.
 */
@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    // TODO method to create a profile

    // TODO method to delete a profile

    // TODO method to get a profile

    // TODO method to get quotes library

    // TODO method to update profile name
}
