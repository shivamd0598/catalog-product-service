package com.poc.catalogproductmanagement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.catalogproductmanagement.model.Laptop;
import com.poc.catalogproductmanagement.service.LaptopService;


@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "*")
public class LaptopController {
	private LaptopService laptopService;
	public LaptopController(LaptopService laptopService) {
		this.laptopService=laptopService;
	}
	
	@GetMapping("/laptops")
	public ResponseEntity<?> getLaptops(){
		return new ResponseEntity<>(laptopService.getAllLaptop(),HttpStatus.OK);
	}
	@PostMapping("/laptops/{id}")
	public ResponseEntity<Laptop> addLaptop(@RequestBody Laptop laptop, @PathVariable("id") Long id){
		laptopService.createLaptop(laptop,id);
		return new ResponseEntity<Laptop>(laptopService.createLaptop(laptop, id),HttpStatus.CREATED);
	}
	@GetMapping("/laptops/{id}")
	public ResponseEntity<?> getLaptop(@PathVariable("id") Long id){
		return new ResponseEntity<>(laptopService.getLaptop(id).orElse(null),HttpStatus.OK);
	}
	@GetMapping("/laptops/laptop-by-vendor/{id}")
	public ResponseEntity<?> getLaptopByVendor(@PathVariable("id") Long id){
		return new ResponseEntity<>(laptopService.getLaptopByVendor(id),HttpStatus.OK);
	}
	@GetMapping("/laptops/laptop-by-name/{name}")
	public ResponseEntity<?> getLaptopByName(@PathVariable("name") String name){
		return new ResponseEntity<>(laptopService.getLaptopByName(name),HttpStatus.OK);
	}
	@PutMapping("/laptops/{id}/{vendorId}")
	public ResponseEntity<?> updateLaptop(@RequestBody Laptop laptop, @PathVariable("id") Long id,@PathVariable("vendorId") Long vendorId){
		return new ResponseEntity<>(laptopService.updateLaptop(laptop, id,vendorId),HttpStatus.OK);
	}
	@DeleteMapping("/laptops/{id}")
	public ResponseEntity<String> deleteLaptop(@PathVariable("id") Long id){
		laptopService.deleteLaptopById(id);
		return new ResponseEntity<String>("Laptop has been deleted sucessfully!!!", HttpStatus.OK);
	}
}
