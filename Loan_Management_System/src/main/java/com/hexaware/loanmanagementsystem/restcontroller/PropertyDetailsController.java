package com.hexaware.loanmanagementsystem.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.loanmanagementsystem.dto.PropertyDetailsDTO;
import com.hexaware.loanmanagementsystem.entity.PropertyDetails;
import com.hexaware.loanmanagementsystem.service.IPropertyDetailsService;

@RestController
@RequestMapping("/api/property-details/")
public class PropertyDetailsController {

	private IPropertyDetailsService propertyDetailsService;

	@Autowired
	public PropertyDetailsController(IPropertyDetailsService propertyDetailsService) {
		super();
		this.propertyDetailsService = propertyDetailsService;
	}

	@PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
	public PropertyDetails addCustomerAccountDetail(@RequestBody PropertyDetailsDTO propertyDetailsDTO) {

		return propertyDetailsService.createpropertyDetails(propertyDetailsDTO);
	}

	@PutMapping(value = "/update", consumes = "application/json", produces = "application/json")
	public PropertyDetails updateCustomerAccountDetail(@RequestBody PropertyDetailsDTO propertyDetailsDTO) {

		return propertyDetailsService.updatepropertyDetails(propertyDetailsDTO);
	}

	@DeleteMapping(value = "/delete/{id}", consumes = "application/json")
	public String deleteCustomerAccountDetail(@PathVariable long id) {

		propertyDetailsService.deletepropertyDetailsById(id);

		return "Deleted ";
	}

	@GetMapping(value = "/getbyid/{id}", produces = "application/json")
	public PropertyDetails getByCustomerAccountDetailId(@PathVariable long id) {

		return propertyDetailsService.getpropertyDetailsId(id);
	}

	@GetMapping(value = "/getAll", produces = "application/json")
	public List<PropertyDetails> getAllCustomerAccountDetails() {

		return propertyDetailsService.getAllPropertyDetails();
	}

}
