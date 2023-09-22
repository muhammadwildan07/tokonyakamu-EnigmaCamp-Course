package com.enigma.camp.tokonyakamu.controller;

import com.enigma.camp.tokonyakamu.entity.Product;
import com.enigma.camp.tokonyakamu.service.ProductService;
import lombok.RequiredArgsConstructor;
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


}


