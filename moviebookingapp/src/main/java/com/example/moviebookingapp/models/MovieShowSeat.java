package com.example.moviebookingapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MovieShowSeat  extends BaseModel{
    @ManyToOne
    private MovieShow movieShow;
    @ManyToOne
    private Seat seat;
    private SeatStatus seatStatus;
}
