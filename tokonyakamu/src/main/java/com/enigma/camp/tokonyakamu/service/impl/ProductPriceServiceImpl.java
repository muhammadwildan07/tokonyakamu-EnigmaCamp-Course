package com.enigma.camp.tokonyakamu.service.impl;

import com.enigma.camp.tokonyakamu.entity.ProductPrice;
import com.enigma.camp.tokonyakamu.repository.ProductPriceRepository;
import com.enigma.camp.tokonyakamu.service.ProductPriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductPriceServiceImpl implements ProductPriceService {
    private final ProductPriceRepository productPriceRepository;
    @Override
    public ProductPrice create(ProductPrice productPrice) {
        return productPriceRepository.save(productPrice);
    }
}
