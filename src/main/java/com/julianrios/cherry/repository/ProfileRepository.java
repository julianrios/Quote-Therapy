package com.julianrios.cherry.repository;

import com.julianrios.cherry.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * This class extends the JpaRepository interface and utilizes all the methods within it to communicate the request
 * sent from the client to the profile service.
 */
@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {
}
