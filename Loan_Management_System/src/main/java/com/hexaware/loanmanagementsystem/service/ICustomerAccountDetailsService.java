package com.hexaware.loanmanagementsystem.service;

import java.util.List;

import com.hexaware.loanmanagementsystem.dto.CustomerAccountDetailsDTO;
import com.hexaware.loanmanagementsystem.entity.CustomerAccountDetails;

public interface ICustomerAccountDetailsService {

	CustomerAccountDetails createCustomerAccountDetails(CustomerAccountDetailsDTO customerAccountDetails);
	CustomerAccountDetails updateCustomerAccountDetails(CustomerAccountDetailsDTO customerAccountDetails);
	
	void deleteCustomerAccountDetails(long CustomerAccountDetailsID);
	
	CustomerAccountDetails getCustomerAccountDetailsByCustomerId(long CustomerID);
	
	List<CustomerAccountDetails> getAllCustomerAccountDetails();
	
	
}
