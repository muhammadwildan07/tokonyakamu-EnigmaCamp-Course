package com.enigma.camp.tokonyakamu.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)

public class ProductRequest {
    private String productId;

    @NotBlank(message = "Product name is required")
    private String productName;

    @NotBlank(message = "Description is required")
    private String description;

    @NotBlank(message = "Price is required")
    @Min(value = 0,message = "Product price must be greater than equal 0")
    private Long price;

    @Min(value = 0,message = "Stock must be greater than equal 0")
    @NotBlank(message = "Stock is required")
    private Integer stock ;

    @NotBlank(message = "store ID is required")
    private String store_id ;

}
