package com.example.moviebookingapp.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class City {
   private String cityName;
    private List<Theater>theaters;
}
