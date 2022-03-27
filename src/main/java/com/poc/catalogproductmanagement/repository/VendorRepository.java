package com.poc.catalogproductmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.catalogproductmanagement.model.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Long> {

}
