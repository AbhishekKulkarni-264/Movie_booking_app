package com.example.moviebookingapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity

public class Customer extends BaseModel{
   private String name;
    private String email;
    @OneToMany
    private List<Booking>bookings;
}
