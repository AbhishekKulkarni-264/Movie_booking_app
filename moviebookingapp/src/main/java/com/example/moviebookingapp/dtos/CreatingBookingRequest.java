package com.example.moviebookingapp.dtos;

import lombok.Data;

import java.util.List;

@Data
public class CreatingBookingRequest {

    private Long userId;
    private Long showId;
    private
    List<Long> seatIds;
}
