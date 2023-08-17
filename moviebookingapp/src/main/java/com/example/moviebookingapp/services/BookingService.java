package com.example.moviebookingapp.services;

import com.example.moviebookingapp.models.*;
import com.example.moviebookingapp.repositories.BookingRepository;
import com.example.moviebookingapp.repositories.CustomerRepository;
import com.example.moviebookingapp.repositories.MovieShowRepository;
import com.example.moviebookingapp.repositories.MovieShowSeatRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookingService {
    private CustomerService customerService;

    private CustomerRepository customerRepository;
    private MovieShowRepository movieShowRepository;
    private BookingRepository bookingRepository;

    private MovieShowSeatRepository movieShowSeatRepository;

    @Transactional(isolation= Isolation.SERIALIZABLE)
    public Booking createBooking(Long customerId, Long showId, List<Long> seatIds){


        //get user

        Optional<Customer> customer=customerRepository.findById(customerId);
        if(customer.isEmpty()){
            throw new IllegalArgumentException("Customer not found");
        }

        Optional<MovieShow> movieShow=movieShowRepository.findById(showId);
        if(movieShow.isEmpty()){
            throw new IllegalArgumentException("Movie show not found");
        }

       List<MovieShowSeat>movieShowSeats=movieShowSeatRepository.findAllById(seatIds);

        if(movieShowSeats.isEmpty()){
            throw new IllegalArgumentException("Seats not found");
        }

        for(MovieShowSeat movieShowSeat:movieShowSeats){
            if(movieShowSeat.getSeatStatus()!= SeatStatus.AVAILABLE){
                throw new IllegalArgumentException("Something went wrong");
            }
        }

        for(MovieShowSeat movieShowSeat:movieShowSeats){
            movieShowSeat.setSeatStatus(SeatStatus.RESERVED);
            movieShowSeatRepository.save(movieShowSeat);
        }


        Booking booking=new Booking();
        booking.setAmount(0);
        booking.setBookedAt(new Date());
        booking.setCustomer(customer.get());
        booking.setMovieShow(movieShow.get());
        booking.setShowSeats(movieShowSeats);

        bookingRepository.save(booking);

        return booking;
    }
}
