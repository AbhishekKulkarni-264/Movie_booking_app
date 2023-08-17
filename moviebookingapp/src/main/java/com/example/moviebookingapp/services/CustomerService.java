package com.example.moviebookingapp.services;

import com.example.moviebookingapp.models.Customer;
import com.example.moviebookingapp.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class CustomerService {

    private CustomerRepository customerRepository;

    public Customer signUp(String name,String email){
        System.out.println("Service layer called for creating customer");

        Customer customer=new Customer();
        customer.setName(name);
        customer.setEmail(email);
        customer.setBookings(new ArrayList<>());

      Customer c1=  customerRepository.save(customer);
        return c1;
    }
}
