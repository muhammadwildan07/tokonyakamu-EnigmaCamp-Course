package com.enigma.camp.tokonyakamu.repository;

import com.enigma.camp.tokonyakamu.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StoreRepository extends JpaRepository<Store, String > {

}
