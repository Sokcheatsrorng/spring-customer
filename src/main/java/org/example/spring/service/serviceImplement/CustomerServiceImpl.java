package org.example.spring.service.serviceImplement;


import org.example.spring.model.entity.Customer;
import org.example.spring.model.request.CustomerRequest;
import org.example.spring.repository.CustomerRepository;
import org.example.spring.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAllCutomer() {
        return customerRepository.getAllCustomer();
    }

    @Override
    public Customer getCutomerByID(Integer id) {
        return customerRepository.getCutomerByID(id);
    }

    @Override
    public Integer createCustomer(CustomerRequest customerRequest) {
        return customerRepository.createCutomer(customerRequest);
    }

    @Override
    public Integer updateCustomer(Integer id, CustomerRequest customerRequest) {
        System.out.println(customerRequest);
        System.out.println(id);
        System.out.println(customerRepository.updateCutomer(id,customerRequest));
        return customerRepository.updateCutomer(id,customerRequest);
    }
}
