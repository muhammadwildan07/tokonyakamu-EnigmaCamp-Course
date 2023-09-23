package com.enigma.camp.tokonyakamu.model.request;

import lombok.*;

import javax.validation.constraints.NotBlank;
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)

public class CustomerRequest {
    private String customerId;

    @NotBlank(message = "Customer name is required")
    private String name;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "Mobile Phone is required")
     private Long mobilePhone;

    @NotBlank(message = "Email is required")
    private String email ;

}
