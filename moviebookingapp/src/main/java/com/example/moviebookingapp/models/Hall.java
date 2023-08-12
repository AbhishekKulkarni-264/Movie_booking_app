package com.example.moviebookingapp.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Hall {
    private  String name;
   private List<Seat> seats;
   private ScreenType screenType;
}
