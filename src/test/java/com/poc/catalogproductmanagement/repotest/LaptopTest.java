package com.poc.catalogproductmanagement.repotest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.poc.catalogproductmanagement.model.Laptop;
import com.poc.catalogproductmanagement.model.Vendor;
import com.poc.catalogproductmanagement.repository.LaptopRepository;
import com.poc.catalogproductmanagement.repository.VendorRepository;
import com.poc.catalogproductmanagement.service.LaptopService;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class LaptopTest {
	/*
	@Autowired
	private LaptopRepository laptopRepository;
	@Autowired
	private VendorRepository vendorRepository;
	@Autowired
	private LaptopService laptopService;
	
	@Test
	@Order(1)
	public void testCCreateLaptop() {
		Laptop laptop=new Laptop();
		laptop.setName("MSI Modern 14");
		laptop.setRam("8");
		laptop.setProcessor("Intel i5-10210U");
		laptop.setOs("Windows 10");
		laptop.setStorageSize("512 GB");
		laptop.setStorageType("NVMe SSD");
		laptop.setPrice(43990);
		Vendor vendor=vendorRepository.findById(8L).get();
		Laptop laptop2=laptopService.createLaptop(laptop, vendor.getId());
		assertNotNull(laptopRepository.findById(laptop2.getId()).get());
	}
	@Test
	@Order(2)
	public void testGetAllLaptops() {
		List<Laptop> laptops=laptopService.getAllLaptop();
		Assertions.assertThat(laptops).size().isGreaterThan(0);
	}
	
	@Test
	@Order(3)
	public void testGetLaptop() {
		Laptop laptop=laptopService.getLaptop(7L).get();
		assertEquals(43990, laptop.getPrice());
	}
	
	@Test
	@Order(4)
	public void testUpdateLaptop() {
		Laptop laptop=laptopService.getLaptop(7L).get();
		laptop.setPrice(69990);
		Laptop laptop2=laptopRepository.save(laptop);
		assertNotEquals(64990, laptopRepository.findById(laptop2.getId()).get());
	}
	@Test
	@Order(5)
	public void testGetLaptopByVendor() {
		List<Laptop> laptops=laptopService.getLaptopByVendor(8L);
		Assertions.assertThat(laptops).size().isGreaterThan(0);
	}
	
	@Test
	@Order(6)
	public void testGetLaptopByName() {
		List<Laptop> laptops=laptopService.getLaptopByName("tuf");
		Assertions.assertThat(laptops).size().isGreaterThan(0);
	}
	@Test
	@Order(7)
	public void testDeleteLaptop() {
		laptopService.deleteLaptopById(7L);
		Assertions.assertThat(laptopRepository.existsById(7L)).isFalse();
	}
	*/
}
