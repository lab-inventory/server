package com.inventory.repository;

import com.inventory.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

public interface VendorRepository extends JpaRepository<Vendor, String> {
    //all crud database method
    String deleteById();
}
