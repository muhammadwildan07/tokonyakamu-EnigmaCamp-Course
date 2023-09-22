package com.enigma.camp.tokonyakamu.controller;

import com.enigma.camp.tokonyakamu.entity.Customer;
import com.enigma.camp.tokonyakamu.model.request.CustomerRequest;
import com.enigma.camp.tokonyakamu.model.response.CommonResponse;
import com.enigma.camp.tokonyakamu.model.response.CustomerResponse;
import com.enigma.camp.tokonyakamu.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<?> createNewCustomer(@RequestBody CustomerRequest request) {
        CustomerResponse customerResponse = customerService.createCustomer(request);
//        return customerService.create(customer);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.<CustomerResponse>builder()
                        .statusCode(HttpStatus.CREATED))

    }

    @GetMapping(value = "/{id}")
    public Customer getCustomerById(@PathVariable String id) {
        return customerService.getById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable String id) {
        customerService.deleteById(id);
    }

    @GetMapping
    public List<Customer> getAllCustomer() {
        return customerService.getAll();
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.update(customer);
    }

//    @PostMapping("/all")
//    public ResponseEntity<?> createCustomerAll(@RequestBody CustomerRequest request) {
//        CustomerResponse CustomerResponse = customerService.createCustomer(request);
//        return ResponseEntity.status(HttpStatus.CREATED)
//                .body(CommonResponse.<CustomerResponse>builder()
//                        .statusCode(HttpStatus.CREATED.value())
//                        .message("Successfully Create New Customer Profile")
//                        .data(CustomerResponse)
//                        .build());

}
}


