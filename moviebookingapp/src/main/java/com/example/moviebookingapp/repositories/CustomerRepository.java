package com.example.moviebookingapp.repositories;

import com.example.moviebookingapp.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    Customer save(Customer customer);

    @Override
    Optional<Customer> findById(Long aLong);

//   Optional<Customer> findCustomerByNameAndEmail();

//   Customer findCustomerByEmail(String email);
}
