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

import com.hexaware.loanmanagementsystem.dto.CustomerAccountDetailsDTO;
import com.hexaware.loanmanagementsystem.entity.CustomerAccountDetails;
import com.hexaware.loanmanagementsystem.service.ICustomerAccountDetailsService;

@RestController
@RequestMapping("/api/customer-account-details/")
public class CustomerAccountDetailsController {

	private ICustomerAccountDetailsService customerAccountDetailsService;

	@Autowired
	public CustomerAccountDetailsController(ICustomerAccountDetailsService customerAccountDetailsService) {
		super();
		this.customerAccountDetailsService = customerAccountDetailsService;
	}

	@PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
	public CustomerAccountDetails addCustomerAccountDetail(
			@RequestBody CustomerAccountDetailsDTO customerAccountDetailsDTO) {

		return customerAccountDetailsService.createCustomerAccountDetails(customerAccountDetailsDTO);
	}

	@PutMapping(value = "/update", consumes = "application/json", produces = "application/json")
	public CustomerAccountDetails updateCustomerAccountDetail(
			@RequestBody CustomerAccountDetailsDTO customerAccountDetailsDTO) {

		return customerAccountDetailsService.updateCustomerAccountDetails(customerAccountDetailsDTO);
	}

	@DeleteMapping(value = "/delete/{id}", consumes = "application/json")
	public String deleteCustomerAccountDetail(@PathVariable long id) {

		customerAccountDetailsService.deleteCustomerAccountDetails(id);

		return "Deleted ";
	}

	@GetMapping(value = "/getbyid/{id}", produces = "application/json")
	public CustomerAccountDetails getByCustomerAccountDetailId(@PathVariable long id) {

		return customerAccountDetailsService.getCustomerAccountDetailsByCustomerId(id);
	}

	@GetMapping(value = "/getAll", produces = "application/json")
	public List<CustomerAccountDetails> getAllCustomerAccountDetails() {

		return customerAccountDetailsService.getAllCustomerAccountDetails();
	}

}
