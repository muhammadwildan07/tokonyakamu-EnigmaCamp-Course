package com.enigma.camp.tokonyakamu.controller;

import com.enigma.camp.tokonyakamu.entity.Product;
import com.enigma.camp.tokonyakamu.model.request.ProductRequest;
import com.enigma.camp.tokonyakamu.model.response.CommonResponse;
import com.enigma.camp.tokonyakamu.model.response.ProductResponse;
import com.enigma.camp.tokonyakamu.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductService ProductService;

    @PostMapping
    public Product createNewProduct(@RequestBody Product product) {
        System.out.println(product);
        return ProductService.create(product);
    }

    @GetMapping(value = "/{id}")
    public Product getProductById(@PathVariable String id) {
        return ProductService.getById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable String id) {
        ProductService.deleteById(id);
    }

    @GetMapping
    public List<Product> getAllProduct() {
        return ProductService.getAll();
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product) {
        return ProductService.update(product);
    }

    @PostMapping("/all")
    public ResponseEntity<?> createProductAll(@RequestBody ProductRequest request) {
        ProductResponse productResponse = ProductService.createProduct(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.<ProductResponse>builder()
                        .statusCode(HttpStatus.CREATED.value())
                        .message("Successfully Create New Project")
                        .data(productResponse)
                        .build());

    }
}


