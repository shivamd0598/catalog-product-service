package com.poc.catalogproductmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.poc.catalogproductmanagement.model.Vendor;

@Service
public interface VendorService {
	public List<Vendor> getAllVendors();
	public String createVendor(Vendor vendor);
	public Optional<Vendor> getVendor(Long id);
	public Vendor updateVendor(Vendor vendor, Long id);
	public void deleteVendorById(Long id) throws NotFoundException;
}
