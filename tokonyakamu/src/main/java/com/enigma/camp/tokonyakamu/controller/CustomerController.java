package com.enigma.camp.tokonyakamu.controller;

import com.enigma.camp.tokonyakamu.entity.Customer;
import com.enigma.camp.tokonyakamu.model.request.CustomerRequest;
import com.enigma.camp.tokonyakamu.model.response.CommonResponse;
import com.enigma.camp.tokonyakamu.model.response.CustomerResponse;
import com.enigma.camp.tokonyakamu.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<?> createCustomer(@RequestBody Customer customer){
        CustomerResponse newData = customerService.create(customer);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.<CustomerResponse> builder()
                        .statusCode(HttpStatus.CREATED.value())
                        .data(newData)
                        .message("Create Customer Data Success ")
                        .build()
                );
    }

   @PutMapping
    private ResponseEntity<?> update (@RequestBody Customer customer)
   {
       CustomerResponse dataCustomer =  customerService.update(customer);
       return ResponseEntity.status(HttpStatus.OK)
               .body(CommonResponse.<CustomerResponse>builder()
                       .statusCode(HttpStatus.OK.value())
                       .message("OK")
                       .data(dataCustomer)
                       .build());
   }

   @GetMapping(path = "/{id}")
    public ResponseEntity<?> getCustomerById(@PathVariable String id){
        CustomerResponse dataId = customerService.getById(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body(CommonResponse.<CustomerResponse>builder()
                        .statusCode(HttpStatus.OK.value())
                        .message("OK")
                        .data(dataId)
                        .build());
   }

    @GetMapping
    public ResponseEntity<?> getAll(){
        List<CustomerResponse> dataCustomer = customerService.getAll();
        return ResponseEntity.status(HttpStatus.OK)
                .body(CommonResponse.<CustomerResponse>builder()
                        .statusCode(HttpStatus.OK.value())
                        .message("Success")
                        .data((CustomerResponse) dataCustomer)
                        .build());
    }

    @DeleteMapping
    public ResponseEntity<?> deleteCustomer (@PathVariable String id){
        customerService.delete(id);
        return ResponseEntity.status(HttpStatus.OK.value())
                .body(CommonResponse.<CustomerResponse>builder()
                        .statusCode(HttpStatus.OK.value())
                        .message("Ok")
                        .build());


    };
}


