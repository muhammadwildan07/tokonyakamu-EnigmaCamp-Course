package com.enigma.camp.tokonyakamu.service.impl;

import com.enigma.camp.tokonyakamu.entity.Customer;
import com.enigma.camp.tokonyakamu.model.request.CustomerRequest;
import com.enigma.camp.tokonyakamu.model.response.CustomerResponse;
import com.enigma.camp.tokonyakamu.repository.CustomerRepository;
import com.enigma.camp.tokonyakamu.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

//    @Override
//    public Customer getById(Customer customer) {
//        return null;
//    }

    @Override
    public Customer getById(String id) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public void deleteById(String Id) {

    }

    @Override
    public CustomerResponse createCustomer(CustomerRequest request) {
        return null;
    }
}
