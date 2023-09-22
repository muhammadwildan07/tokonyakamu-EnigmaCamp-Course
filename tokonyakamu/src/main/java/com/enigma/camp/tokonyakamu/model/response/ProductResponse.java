package com.enigma.camp.tokonyakamu.model.response;

import com.enigma.camp.tokonyakamu.entity.Store;
import com.enigma.camp.tokonyakamu.model.request.ProductRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ProductResponse {
    private String id;
    private String productName;
    private String description;
    private Long price;
    private Integer stock;
    private StoreResponse store;
//   ProductResponse createProduct(ProductRequest request);

}
