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

import com.hexaware.loanmanagementsystem.dto.CustomerLoanInformationDTO;
import com.hexaware.loanmanagementsystem.entity.CustomerLoanInformation;
import com.hexaware.loanmanagementsystem.service.ICustomerLoanInformationService;

@RestController
@RequestMapping("/api/customer-loan-information/")
public class CustomerLoanInformationController {

	private ICustomerLoanInformationService customerLoanInformationService;

	@Autowired
	public CustomerLoanInformationController(ICustomerLoanInformationService customerLoanInformationService) {
		super();
		this.customerLoanInformationService = customerLoanInformationService;
	}

	@PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
	public CustomerLoanInformation createCustomerLoanInformation(
			@RequestBody CustomerLoanInformationDTO customerLoanInformationDTO) {

		return customerLoanInformationService.createCustomerLoanInformation(customerLoanInformationDTO);
	}

	@PutMapping(value = "/update", consumes = "application/json", produces = "application/json")
	public CustomerLoanInformation updateCustomerLoanInformation(
			@RequestBody CustomerLoanInformationDTO customerLoanInformationDTO) {

		return customerLoanInformationService.updateCustomerLoanInformation(customerLoanInformationDTO);
	}

	@DeleteMapping(value = "/delete/{ID}", consumes = "application/json")
	public String deleteCustomerLoanInformation(@PathVariable long ID) {

		customerLoanInformationService.deleteCustomerLoanInformation(ID);

		return "DELETED : ";
	}

	@GetMapping(value = "/getbyid/{id}", produces = "application/json")
	public CustomerLoanInformation getByCustomerLoanInformationId(@PathVariable int id) {

		return customerLoanInformationService.getCustomerLoanInformationByLoanNumber(id);
	}

	@GetMapping(value = "/getAll", produces = "application/json")
	public List<CustomerLoanInformation> getAllCustomerLoanInformation() {

		return customerLoanInformationService.getAllCustomerLoanInformation();
	}

}
