package com.enigma.camp.tokonyakamu.service.impl;

import com.enigma.camp.tokonyakamu.entity.Store;
import com.enigma.camp.tokonyakamu.repository.StoreRepository;
import com.enigma.camp.tokonyakamu.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreServiceImpl implements StoreService {
    private final StoreRepository  storeRepository;

    @Override
    public Store create(Store store) {
        System.out.println(store);
        return storeRepository.save(store);
    }

    @Override
    public Store update(Store store) {

        Store currentStore = getById(store.getId());
        if (currentStore != null) {
            return storeRepository.save(store);
        }
        return null;
    }

    @Override
    public Store getById(String id) {
        return storeRepository.findById(id).get();
    }

    @Override
    public List<Store> getAll() {
        return storeRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
         storeRepository.deleteById(id);
    }
}
