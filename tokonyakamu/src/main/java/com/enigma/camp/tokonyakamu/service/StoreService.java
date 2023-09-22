package com.enigma.camp.tokonyakamu.service;
import com.enigma.camp.tokonyakamu.entity.Store;

import java.util.List;

public interface StoreService {
    Store create(Store store);
    Store update(Store store);
    Store getById(String id);
    List<Store> getAll();

    void deleteById(String Id);
}
