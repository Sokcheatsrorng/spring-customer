package org.example.spring.service;


import org.example.spring.model.entity.Customer;
import org.example.spring.model.request.CustomerRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    List<Customer> getAllCutomer();

    Customer getCutomerByID(Integer id);

    Integer createCustomer(CustomerRequest customerRequest);

    Integer updateCustomer(Integer id, CustomerRequest customerRequest);
}
