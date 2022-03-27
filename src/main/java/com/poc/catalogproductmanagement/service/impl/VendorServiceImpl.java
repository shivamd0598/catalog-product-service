package com.poc.catalogproductmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.poc.catalogproductmanagement.model.Vendor;
import com.poc.catalogproductmanagement.repository.VendorRepository;
import com.poc.catalogproductmanagement.service.VendorService;

@Service
public class VendorServiceImpl implements VendorService {
	private VendorRepository vendorRepository;
	public VendorServiceImpl(VendorRepository vendorRepository) {
		this.vendorRepository=vendorRepository;
	}
	@Override
	public List<Vendor> getAllVendors() {
		return vendorRepository.findAll();
	}
	@Override
	public String createVendor(Vendor vendor) {
		vendorRepository.save(vendor);
		return "Vendor has been created successfully!!!";
	}
	@Override
	public Optional<Vendor> getVendor(Long id) {
		return vendorRepository.findById(id);
	}
	@Override
	public Vendor updateVendor(Vendor vendorReq, Long id) {
		Vendor vendor=vendorRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Vendor not exist with id :"+id));
		vendor.setName(vendorReq.getName());
		vendor.setAddress(vendorReq.getAddress());
		vendor.setRating(vendorReq.getRating());
		vendor.setContactNo(vendorReq.getContactNo());
		return vendorRepository.save(vendor);
	}
	@Override
	public void deleteVendorById(Long id) throws NotFoundException {
		Vendor vendor=vendorRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Vendor not exist with id :"+id));
        if (vendor == null) throw new NotFoundException();
		vendorRepository.delete(vendor);
	}
}
