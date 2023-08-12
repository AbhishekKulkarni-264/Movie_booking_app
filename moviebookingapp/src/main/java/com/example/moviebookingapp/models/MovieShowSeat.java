package com.example.moviebookingapp.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieShowSeat {
    private MovieShow movieShow;
    private Seat seat;
    private SeatStatus seatStatus;
}
