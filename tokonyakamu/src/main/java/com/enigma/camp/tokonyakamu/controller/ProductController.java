package com.enigma.camp.tokonyakamu.controller;

import com.enigma.camp.tokonyakamu.entity.Product;
import com.enigma.camp.tokonyakamu.model.request.ProductRequest;
import com.enigma.camp.tokonyakamu.model.response.CommonResponse;
import com.enigma.camp.tokonyakamu.model.response.ProductResponse;
import com.enigma.camp.tokonyakamu.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
@Autowired
    private ProductService productService;

    @PostMapping
    public Product createNewProduct(@RequestBody Product product) {
        System.out.println(product);
        return productService.create(product);
    }

    @GetMapping(value = "/{id}")
    public Product getProductById(@PathVariable String id) {
        return productService.getById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable String id) {
        productService.deleteById(id);
    }

    @GetMapping
    public List<Product> getAllProduct() {
        return productService.getAll();
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product) {
        return productService.update(product);
    }

    @PostMapping("/all")
    public ResponseEntity<?> createProductAll(@RequestBody ProductRequest request) {
        ProductResponse productResponse = productService.createProduct(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.<ProductResponse>builder()
                        .statusCode(HttpStatus.CREATED.value())
                        .message("Successfully Create New Project")
                        .data(productResponse)
                        .build());

    }
}


