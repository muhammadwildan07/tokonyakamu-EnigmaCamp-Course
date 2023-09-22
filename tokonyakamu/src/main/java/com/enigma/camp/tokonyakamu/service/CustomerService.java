package com.enigma.camp.tokonyakamu.service;

import com.enigma.camp.tokonyakamu.entity.Customer;
import com.enigma.camp.tokonyakamu.model.request.CustomerRequest;
import com.enigma.camp.tokonyakamu.model.response.CustomerResponse;

import java.util.List;

public interface CustomerService {
    Customer create(Customer customer);

    Customer update(Customer customer);

//    Customer getById(Customer customer);

    Customer getById(String id);

    List<Customer> getAll();

    void deleteById(String Id);

    CustomerResponse createCustomer(CustomerRequest request);
}
