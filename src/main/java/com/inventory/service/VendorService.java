package com.inventory.service;

import com.inventory.exception.ResourceNotFoundException;
import com.inventory.model.Vendor;

import java.util.List;

public interface VendorService {
    public static String saveVendor(Vendor vendor) {
        return null;
    }

    public static List<Vendor> getAllVendor() {
        return null;
    }

    public Vendor findById(Integer id) throws ResourceNotFoundException;

    public String deleteById(Integer id);

    String deleteById(Vendor vendor);
}
