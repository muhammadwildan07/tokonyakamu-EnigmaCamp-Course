package com.enigma.camp.tokonyakamu.repository;

import com.enigma.camp.tokonyakamu.entity.Customer;
import com.enigma.camp.tokonyakamu.entity.ProductPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {
}
