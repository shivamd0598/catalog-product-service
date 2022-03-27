package com.poc.catalogproductmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.poc.catalogproductmanagement.model.Laptop;


public interface LaptopRepository extends JpaRepository<Laptop, Long> {
	List<Laptop> findByVendorId(Long id);
	List<Laptop> findByNameContains(String name);
	//@Query("SELECT l FROM Laptop l WHERE l.name LIKE %:laptopName%")
	//List<Laptop> searchLaptopByName(@Param("laptopName") String name);
}
