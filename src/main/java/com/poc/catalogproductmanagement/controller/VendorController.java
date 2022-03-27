package com.poc.catalogproductmanagement.controller;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
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

import com.poc.catalogproductmanagement.model.Vendor;
import com.poc.catalogproductmanagement.service.VendorService;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "*")
public class VendorController {
	private VendorService vendorService;
	public VendorController(VendorService vendorService) {
		this.vendorService=vendorService;
	}
	@GetMapping("/vendors")
	public ResponseEntity<?> getVendors(){
		return new ResponseEntity<>(vendorService.getAllVendors(),HttpStatus.OK);
	}
	@PostMapping("/vendors")
	public ResponseEntity<?> addVendor(@RequestBody Vendor vendor){
		String msg=vendorService.createVendor(vendor);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	@GetMapping("/vendors/{id}")
	public ResponseEntity<Vendor> getVendor(@PathVariable("id") Long id){
		return new ResponseEntity<Vendor>(vendorService.getVendor(id).orElse(null),HttpStatus.OK);
	}
	@PutMapping("/vendors/{id}")
	public ResponseEntity<?> updateVendor(@RequestBody Vendor vendor,@PathVariable("id") Long id){
		return new ResponseEntity<>(vendorService.updateVendor(vendor, id),HttpStatus.OK);
	}
	@DeleteMapping("vendors/{id}")
	public ResponseEntity<String> deleteVendor(@PathVariable("id") Long id) throws NotFoundException{
		vendorService.deleteVendorById(id);
		return new ResponseEntity<String>("Vendor has been delete sucessfully!!!",HttpStatus.OK);
	}
}
