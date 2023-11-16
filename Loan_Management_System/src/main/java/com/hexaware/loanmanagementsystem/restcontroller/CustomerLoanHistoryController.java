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

import com.hexaware.loanmanagementsystem.dto.CustomerLoanHistoryDTO;
import com.hexaware.loanmanagementsystem.entity.CustomerLoanHistory;
import com.hexaware.loanmanagementsystem.service.ICustomerLoanHistoryService;

@RestController
@RequestMapping("/api/customer-loan-history/")
public class CustomerLoanHistoryController {

	private ICustomerLoanHistoryService customerLoanHistoryService;

	@Autowired
	public CustomerLoanHistoryController(ICustomerLoanHistoryService customerLoanHistoryService) {
		super();
		this.customerLoanHistoryService = customerLoanHistoryService;
	}

	@PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
	public CustomerLoanHistory createCustomerLoanHistory(@RequestBody CustomerLoanHistoryDTO customerLoanHistoryDTO) {

		return customerLoanHistoryService.createLoanHistory(customerLoanHistoryDTO);
	}

	@PutMapping(value = "/update", consumes = "application/json", produces = "application/json")
	public CustomerLoanHistory updateCustomerLoanHistory(@RequestBody CustomerLoanHistoryDTO customerLoanHistoryDTO) {

		return customerLoanHistoryService.updateLoanHistory(customerLoanHistoryDTO);
	}

	@DeleteMapping(value = "/delete/{ID}", consumes = "application/json")
	public String deleteCustomerLoanHistory(@PathVariable long ID) {

		customerLoanHistoryService.deleteLoanHistory(ID);

		return "DELETED : ";
	}

	@GetMapping(value = "/getbyid/{id}", produces = "application/json")
	public CustomerLoanHistory getByCustomerLoanHistory(@PathVariable int id) {

		return customerLoanHistoryService.getLoanHistoryByLoanNumber(id);
	}

	@GetMapping(value = "/getAll", produces = "application/json")
	public List<CustomerLoanHistory> getAllCustomerLoanHistory() {

		return customerLoanHistoryService.getAllLoanHistoryByCustomerId();
	}

}
