package com.example.moviebookingapp.repositories;

import com.example.moviebookingapp.models.MovieShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieShowSeatRepository extends JpaRepository<MovieShowSeat,Long> {

    Optional<List<MovieShowSeat>> findAllById(Long aLong);
   // Optional<MovieShowSeat> save(MovieShowSeat movieShowSeat);
}
