package com.example.moviebookingapp.controllers;

import com.example.moviebookingapp.dtos.CreateBookingResponse;
import com.example.moviebookingapp.dtos.CreatingBookingRequest;
import com.example.moviebookingapp.models.Booking;
import com.example.moviebookingapp.services.BookingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bms/v1/booking")
@AllArgsConstructor
public class BookingController {

    private BookingService bookingService;

    @PostMapping("/create")
    public CreateBookingResponse createBooking(@RequestBody CreatingBookingRequest request){

        Booking booking= bookingService.createBooking(request.getUserId(), request.getShowId(),request.getSeatIds());
        return new CreateBookingResponse("Success");
    }
}
