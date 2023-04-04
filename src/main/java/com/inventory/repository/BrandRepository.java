package com.inventory.repository;
import com.inventory.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface BrandRepository extends JpaRepository<Brand, Integer> {
    //all crud database methods
}
