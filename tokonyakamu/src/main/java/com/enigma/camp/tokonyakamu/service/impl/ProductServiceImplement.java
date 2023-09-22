package com.enigma.camp.tokonyakamu.service.impl;

import com.enigma.camp.tokonyakamu.entity.Product;
import com.enigma.camp.tokonyakamu.entity.ProductPrice;
import com.enigma.camp.tokonyakamu.entity.Store;
import com.enigma.camp.tokonyakamu.model.request.ProductRequest;
import com.enigma.camp.tokonyakamu.model.response.ProductResponse;
import com.enigma.camp.tokonyakamu.model.response.StoreResponse;
import com.enigma.camp.tokonyakamu.repository.ProductRepository;
import com.enigma.camp.tokonyakamu.service.ProductPriceService;
import com.enigma.camp.tokonyakamu.service.ProductService;
import com.enigma.camp.tokonyakamu.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImplement implements ProductService {

    private final ProductRepository productRepository;
    private final StoreService storeService;
    private final ProductPriceService productPriceService;



    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        Product currrentProduct = getById(product.getId());
        if (currrentProduct!=null){
            return productRepository.save(product);
        }
        return null;
    }

    @Override
    public Product getById(Product product) {
        return null;
    }

    @Override
    public Product getById(String id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public void deleteById(String Id) {

    }

    @Transactional(rollbackOn = Exception.class)
    @Override
    public ProductResponse createProduct(ProductRequest request){
        Store store = storeService.getById(request.getStore_id());

        Product product= Product.builder()
                .name(request.getProductName())
                .description(request.getDescription())
                .build();
        productRepository.saveAndFlush(product);

        ProductPrice productPrice = ProductPrice.builder()
                .price(request.getPrice())
                .stock(request.getStock())
                .store(store)
                .product(product)
                .isActive(true)
                .build();

        productPriceService.create(productPrice);
        return ProductResponse.builder()
                .id(product.getId())
                .productName(product.getName())
                .description(product.getDescription())
                .price(productPrice.getPrice())
                .stock(productPrice.getStock())
                .store(StoreResponse.builder()
                        .id(store.getId())
                        .name(store.getName())
                        .address(store.getAddres())
                        .build())
                .build();

    }
}
