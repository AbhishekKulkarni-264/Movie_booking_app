package com.example.moviebookingapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class MovieShow extends BaseModel {
    @ManyToOne
    private Movie movie;
    private Date startTime;
    private int duaration;
    @ManyToOne
    private Hall hall;
}
