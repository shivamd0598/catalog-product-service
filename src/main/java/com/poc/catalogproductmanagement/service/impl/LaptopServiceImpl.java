package com.poc.catalogproductmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.poc.catalogproductmanagement.model.Laptop;
import com.poc.catalogproductmanagement.model.Vendor;
import com.poc.catalogproductmanagement.repository.LaptopRepository;
import com.poc.catalogproductmanagement.repository.VendorRepository;
import com.poc.catalogproductmanagement.service.LaptopService;

@Service
public class LaptopServiceImpl implements LaptopService {
	private LaptopRepository laptopRepository;
	private VendorRepository vendorRepository;
	public LaptopServiceImpl(LaptopRepository laptopRepository,  VendorRepository vendorRepository) {
		this.laptopRepository=laptopRepository;
		this.vendorRepository=vendorRepository;
	}
	@Override
	public List<Laptop> getAllLaptop() {
		return laptopRepository.findAll();
	}
	
	@Override
	public Laptop createLaptop(Laptop laptop, Long id) {
		Vendor vendor=vendorRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Vendor not exist with id :"+id));
		laptop.setVendor(vendor);
		return laptopRepository.save(laptop);
	}
	@Override
	public Optional<Laptop> getLaptop(Long id) {
		return laptopRepository.findById(id);
	}	
	@Override
	public Laptop updateLaptop(Laptop laptopReq, Long id, Long vendorId) {
		Laptop laptop=	laptopRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Laptop not exist with id :"+id));
		laptop.setName(laptopReq.getName());
		laptop.setProcessor(laptopReq.getProcessor());
		laptop.setRam(laptopReq.getRam());
		laptop.setOs(laptopReq.getOs());
		laptop.setStorageType(laptopReq.getStorageType());
		laptop.setStorageSize(laptopReq.getStorageSize());
		laptop.setPrice(laptopReq.getPrice());
		Vendor vendor=vendorRepository.findById(vendorId).orElseThrow(()->new ResourceNotFoundException("Vendor not exist with id :"+id));
		laptop.setVendor(vendor);
		return laptopRepository.save(laptop);
	}
	
	@Override
	public void deleteLaptopById(Long id) {
		Laptop laptop=laptopRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Laptop not exist with id :"+id));
		laptopRepository.delete(laptop);
	}
	@Override
	public List<Laptop> getLaptopByVendor(Long id) {
		return laptopRepository.findByVendorId(id);
	}
	@Override
	public List<Laptop> getLaptopByName(String name) {
		return laptopRepository.findByNameContains(name);
	}
}
