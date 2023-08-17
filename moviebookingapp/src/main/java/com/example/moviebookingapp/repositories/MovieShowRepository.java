package com.example.moviebookingapp.repositories;

import com.example.moviebookingapp.models.MovieShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieShowRepository extends JpaRepository<MovieShow,Long> {

    Optional<MovieShow> findById(Long id);

}
