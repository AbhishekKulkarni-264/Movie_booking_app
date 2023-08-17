package com.example.moviebookingapp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class CreateCustomerRequest {
    private  String name;
    private String email;
}
