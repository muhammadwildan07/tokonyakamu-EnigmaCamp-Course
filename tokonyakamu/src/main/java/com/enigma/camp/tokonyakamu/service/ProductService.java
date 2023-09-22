package com.enigma.camp.tokonyakamu.service;

import com.enigma.camp.tokonyakamu.entity.Product;
import com.enigma.camp.tokonyakamu.entity.Product;
import com.enigma.camp.tokonyakamu.model.request.ProductRequest;
import com.enigma.camp.tokonyakamu.model.response.ProductResponse;

import java.util.List;

public interface ProductService {
    Product create(Product product);

    Product update(Product Product);

    Product getById(Product product);

    Product getById(String id);

    List<Product> getAll();

    void deleteById(String Id);

    ProductResponse createProduct(ProductRequest request);
}
