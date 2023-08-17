package com.example.moviebookingapp.controllers;

import com.example.moviebookingapp.dtos.CreateCustomerRequest;
import com.example.moviebookingapp.dtos.CreateCustomerResponse;
import com.example.moviebookingapp.models.Customer;
import com.example.moviebookingapp.services.CustomerService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bms/v1/customer")
@AllArgsConstructor
public class CustomerController {


    private CustomerService customerService;

    @PostMapping("/create")
    public CreateCustomerResponse createCustomer(@RequestBody CreateCustomerRequest request){
        System.out.println("Received request for creating user");
        Customer customer= customerService.signUp(request.getName(),request.getEmail());
        System.out.println(customer);
        return new CreateCustomerResponse("Created",customer.getId());
    }


}
