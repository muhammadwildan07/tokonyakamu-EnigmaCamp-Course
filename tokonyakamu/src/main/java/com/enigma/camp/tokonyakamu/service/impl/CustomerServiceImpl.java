package com.enigma.camp.tokonyakamu.service.impl;

import com.enigma.camp.tokonyakamu.entity.Customer;
import com.enigma.camp.tokonyakamu.model.request.CustomerRequest;
import com.enigma.camp.tokonyakamu.model.response.CustomerResponse;
import com.enigma.camp.tokonyakamu.repository.CustomerRepository;
import com.enigma.camp.tokonyakamu.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerResponse create(Customer request) {
        Customer customer = customerRepository.save(request);
        return toCustomerResponse(customer);
    }

    @Override
    public CustomerResponse toCustomerResponse(Customer customer) {
        return CustomerResponse.builder()
                .id(customer.getId())
                .name(customer.getName())
                .build();
    }

    @Override
    public CustomerResponse update(Customer customer) {
        Customer currentCustomer = customerRepository.findById(customer.getId())
                .orElseThrow();
        if (currentCustomer != null){
            Customer response = customerRepository.save(currentCustomer);
            return toCustomerResponse(response);
        }
        return null;
    }

    @Override
    public CustomerResponse getById(String id) {
        Customer customerId = customerRepository.findById(id).get();
        return toCustomerResponse(customerId);
    }

    @Override
    public List<CustomerResponse> getAll() {
        List<Customer> customers = customerRepository.findAll();

        return customers.stream().map(this::toCustomerResponse).collect(Collectors.toList());
    }

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);

    }


}
