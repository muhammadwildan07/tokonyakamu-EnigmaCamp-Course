package com.enigma.camp.tokonyakamu.model.response;

import com.enigma.camp.tokonyakamu.entity.Store;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class StoreResponse extends Store {
    private String id;
    private String name;
    private String address;


}
