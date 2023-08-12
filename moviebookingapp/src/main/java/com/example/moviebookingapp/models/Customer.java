package com.example.moviebookingapp.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Customer {
   private String name;
    private String email;

    private List<Booking>bookings;
}
