package com.example.moviebookingapp.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MovieShow {
    private Movie movie;
    private Date startTime;
    private int duaration;
    private Hall hall;
}
