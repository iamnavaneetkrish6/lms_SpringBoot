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

import com.hexaware.loanmanagementsystem.dto.CustomerDetailsDTO;
import com.hexaware.loanmanagementsystem.entity.CustomerDetails;
import com.hexaware.loanmanagementsystem.service.ICustomerDetailsService;

@RestController
@RequestMapping("/api/customer-details/")
public class CustomerDetailsController {

	private ICustomerDetailsService customerDetailsService;

	@Autowired
	public CustomerDetailsController(ICustomerDetailsService customerDetailsService) {
		super();
		this.customerDetailsService = customerDetailsService;
	}

	@PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
	public CustomerDetails createCustomerDetails(@RequestBody CustomerDetailsDTO customerDetailsDTO) {

		return customerDetailsService.customerRegisteration(customerDetailsDTO);
	}

	@PutMapping(value = "/update", consumes = "application/json", produces = "application/json")
	public CustomerDetails updateCustomerDetails(@RequestBody CustomerDetailsDTO customerDetailsDTO) {

		return customerDetailsService.updateCustomerDetails(customerDetailsDTO);
	}

	@DeleteMapping(value = "/delete/{ID}", consumes = "application/json")
	public String deleteCustomerDetails(@PathVariable long ID) {

		customerDetailsService.deleteCustomer(ID);

		return "DELETED : ";
	}

	@GetMapping(value = "/getbyid/{id}", produces = "application/json")
	public CustomerDetails getByCustomerDetailsId(@PathVariable int id) {

		return customerDetailsService.getCustomerDetailsById(id);
	}

	@GetMapping(value = "/getAll", produces = "application/json")
	public List<CustomerDetails> getAllCustomerDetails() {

		return customerDetailsService.getAllCustomerDetails();
	}

}
