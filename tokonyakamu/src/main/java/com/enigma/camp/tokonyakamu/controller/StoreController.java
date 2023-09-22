package com.enigma.camp.tokonyakamu.controller;

import com.enigma.camp.tokonyakamu.entity.Store;
import com.enigma.camp.tokonyakamu.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/store")
public class StoreController {

    private final StoreService storeService;

    @PostMapping
    public Store createNewStore(@RequestBody Store store) {
        System.out.println(store);
        return storeService.create(store);
    }

    @GetMapping(value = "/{id}")
    public Store getStoreById(@PathVariable String id) {
        return storeService.getById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable String id) {
        storeService.deleteById(id);
    }
    @GetMapping
    public List<Store> getAllStore(){
        return storeService.getAll();
    }

    @PutMapping
    public Store updateStore(@RequestBody Store store){
        return storeService.update(store);
    }



}
