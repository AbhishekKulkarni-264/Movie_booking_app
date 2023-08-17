package com.example.moviebookingapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel {
    @ManyToOne
    private Customer customer;
   @OneToMany
    private List<MovieShowSeat> showSeats;
    @OneToOne
   private MovieShow movieShow;
   private Date bookedAt;
   private double amount;
}
