package com.poc.catalogproductmanagement.repotest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.poc.catalogproductmanagement.model.Vendor;
import com.poc.catalogproductmanagement.repository.VendorRepository;
import com.poc.catalogproductmanagement.service.VendorService;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class VendorTest {
	/*
	@Autowired
	private VendorService vendorService;
	@Autowired
	private VendorRepository vendorRepository;
	@Test
	@Order(1)
	public void testCreate() {
		Vendor vendor=new Vendor();
		vendor.setName("Xiaomi");
		vendor.setRating(4.1f);
		vendor.setAddress("Bejing,China");
		vendor.setContactNo("777-344-998");
		String res=vendorService.createVendor(vendor);
		assertEquals("Vendor has been created successfully!!!", res);
	}
	
	@Test
	@Order(2)
	public void testGetAllVendors() {
		List<Vendor> vendors=vendorService.getAllVendors();
		assertTrue(vendors.size() > 0);
	}
	
	@Test
	@Order(3)
	public void testGetVendor() {
		Vendor vendor =vendorService.getVendor(9L).get();
		assertEquals("777-344-998", vendor.getContactNo());
	}
	
	@Test
	@Order(4)
	public void testUpdateVendor() {
		Vendor vendor=vendorRepository.findById(9L).get();
		vendor.setContactNo("777-333-998");
		vendorRepository.save(vendor);
		assertNotEquals("777-344-998",vendorRepository.findById(9L).get().getContactNo());
	}
	
	@Test
	@Order(5)
	public void testDeleteVendor() throws NotFoundException {
		vendorService.deleteVendorById(9L);
		Assertions.assertThat(vendorRepository.existsById(9L)).isFalse();
	}
	*/
}
