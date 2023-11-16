package com.hexaware.loanmanagementsystem.service;

import java.util.List;

import com.hexaware.loanmanagementsystem.dto.CustomerDetailsDTO;
import com.hexaware.loanmanagementsystem.entity.CustomerDetails;



public interface ICustomerDetailsService {

	CustomerDetails customerRegisteration(CustomerDetailsDTO customer);
	CustomerDetails updateCustomerDetails(CustomerDetailsDTO customer);
	
	void deleteCustomer(long customerId);
	
	CustomerDetails getCustomerDetailsById (long customerId);
	List<CustomerDetails> getAllCustomerDetails();
	
}
