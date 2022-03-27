package com.poc.catalogproductmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.poc.catalogproductmanagement.model.Laptop;

@Service
public interface LaptopService {
	public List<Laptop> getAllLaptop();
	public Laptop createLaptop(Laptop laptop, Long id);
	public Optional<Laptop> getLaptop(Long id);
	public Laptop updateLaptop(Laptop laptop, Long id, Long vendorId);
	public void deleteLaptopById(Long id);
	public List<Laptop> getLaptopByVendor(Long id);
	public List<Laptop> getLaptopByName(String name);
}
