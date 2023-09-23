package com.enigma.camp.tokonyakamu.service;

import com.enigma.camp.tokonyakamu.entity.Customer;
import com.enigma.camp.tokonyakamu.model.request.CustomerRequest;
import com.enigma.camp.tokonyakamu.model.response.CustomerResponse;

import java.util.List;

public interface CustomerService {
    CustomerResponse create(Customer customer);

    CustomerResponse toCustomerResponse(Customer customer);

    CustomerResponse update(Customer customer);

//    Customer getById(Customer customer);

    CustomerResponse getById(String id);

    List<CustomerResponse> getAll();

    void delete(String id);

//    CustomerResponse createCustomer(CustomerRequest request);
}
