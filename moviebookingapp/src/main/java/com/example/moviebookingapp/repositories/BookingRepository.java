package com.example.moviebookingapp.repositories;

import com.example.moviebookingapp.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository

public interface BookingRepository extends JpaRepository<Booking,Long> {

    Booking save(Booking booking);
    Optional<Booking> findBookingById(Long id);
}
