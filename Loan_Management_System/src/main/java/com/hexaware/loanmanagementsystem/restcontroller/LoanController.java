package com.hexaware.loanmanagementsystem.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.loanmanagementsystem.dto.LoanApplyDetailsDTO;
import com.hexaware.loanmanagementsystem.entity.CustomerLoanInformation;
import com.hexaware.loanmanagementsystem.entity.LoanApplyDetails;
import com.hexaware.loanmanagementsystem.service.CustomerLoanInformationServiceImp;
import com.hexaware.loanmanagementsystem.service.LoanApplyDetailsServiceImp;

@RestController
@RequestMapping("/api/loan-service/")
public class LoanController {

	@Autowired
	LoanApplyDetailsServiceImp loanService;

	@Autowired
	CustomerLoanInformationServiceImp loanInformationService;

	@PostMapping(value = "applyloan", consumes = "application/json", produces = "application/json")
	public LoanApplyDetails createLoan(@RequestBody LoanApplyDetailsDTO loanApplyDetailsDto) {

		return loanService.createLoanApplyDetails(loanApplyDetailsDto);
	}

	@GetMapping("loanstatus/{loanNumber}")
	public CustomerLoanInformation getCustomerLoanStatusByLoanNumber(@PathVariable long loanNumber) {

		return loanInformationService.getCustomerLoanInformationByLoanNumber(loanNumber);
	}

}
