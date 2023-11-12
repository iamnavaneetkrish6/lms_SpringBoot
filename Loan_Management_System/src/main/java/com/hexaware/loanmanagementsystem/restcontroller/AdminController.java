package com.hexaware.loanmanagementsystem.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.loanmanagementsystem.dto.CustomerLoanInformationDTO;
import com.hexaware.loanmanagementsystem.entity.CustomerLoanInformation;
import com.hexaware.loanmanagementsystem.entity.LoanApplyDetails;
import com.hexaware.loanmanagementsystem.service.CustomerLoanInformationServiceImp;
import com.hexaware.loanmanagementsystem.service.LoanApplyDetailsServiceImp;

@RestController
@RequestMapping("/api/admin/")
public class AdminController {

	@Autowired
	LoanApplyDetailsServiceImp loanDetailsService;
	
	@Autowired
	CustomerLoanInformationServiceImp customerLoanInformationService;
	
	@GetMapping("getall/applied-loan")
	public List<LoanApplyDetails> getAllAppliedLoanDetails(){
		
		return loanDetailsService.getAllLoanDetails();
		}
	
	public CustomerLoanInformation createLoanStatus(CustomerLoanInformationDTO customerLoanInformationDto) {
		
		return customerLoanInformationService.createCustomerLoanInformation(customerLoanInformationDto);
	}
	
}
