package com.example.moviebookingapp.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Booking {
    private Customer customer;
   private List<MovieShowSeat>movieShowSeats;
   private MovieShow movieShow;
   private Date bookedAt;
   private double amount;
}
