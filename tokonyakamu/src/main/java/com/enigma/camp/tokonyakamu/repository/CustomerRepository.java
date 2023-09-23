package com.enigma.camp.tokonyakamu.repository;

import com.enigma.camp.tokonyakamu.entity.Customer;
import com.enigma.camp.tokonyakamu.entity.ProductPrice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,String> {

    Optional<Customer> findById(String id);
}
