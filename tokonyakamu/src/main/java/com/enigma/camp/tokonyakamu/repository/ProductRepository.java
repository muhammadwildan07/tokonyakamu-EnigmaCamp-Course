package com.enigma.camp.tokonyakamu.repository;

import com.enigma.camp.tokonyakamu.entity.Product;
import com.enigma.camp.tokonyakamu.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String > {

}
