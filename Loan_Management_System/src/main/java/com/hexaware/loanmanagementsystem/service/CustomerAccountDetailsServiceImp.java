package com.hexaware.loanmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.loanmanagementsystem.dto.CustomerAccountDetailsDTO;
import com.hexaware.loanmanagementsystem.entity.CustomerAccountDetails;
import com.hexaware.loanmanagementsystem.repository.CustomerAccountDetailsRepository;

@Service
public class CustomerAccountDetailsServiceImp implements ICustomerAccountDetailsService {

	@Autowired
	CustomerAccountDetailsRepository customerAccountDetailRepository;



	@Override
	public CustomerAccountDetails updateCustomerAccountDetails(CustomerAccountDetailsDTO customerAccountDetails) {

		CustomerAccountDetails customerAccountDetail = new CustomerAccountDetails();
		customerAccountDetail.setAccountNumber(customerAccountDetails.getAccountNumber());
		customerAccountDetail.setBankName(customerAccountDetails.getBankName());
		customerAccountDetail.setPanCardNumber(customerAccountDetails.getPanCardNumber());
		customerAccountDetail.setAadharNumber(customerAccountDetails.getAadharNumber());
		
		
		
		return customerAccountDetailRepository.save(customerAccountDetail);
	}

	@Override
	public void deleteCustomerAccountDetails(long CustomerAccountDetailsID) {

		customerAccountDetailRepository.deleteById(CustomerAccountDetailsID);
		
	}

	@Override
	public CustomerAccountDetails getCustomerAccountDetailsByCustomerId(long CustomerID) {
		// TODO Auto-generated method stub
		return customerAccountDetailRepository.findById(CustomerID).orElse(new CustomerAccountDetails());
	}

	@Override
	public List<CustomerAccountDetails> getAllCustomerAccountDetails() {
		// TODO Auto-generated method stub
		return customerAccountDetailRepository.findAll();
	}

	@Override
	public CustomerAccountDetails createCustomerAccountDetails(CustomerAccountDetailsDTO customerAccountDetails) {
		CustomerAccountDetails customerAccountDetail = new CustomerAccountDetails();
		customerAccountDetail.setAccountNumber(customerAccountDetails.getAccountNumber());
		customerAccountDetail.setBankName(customerAccountDetails.getBankName());
		customerAccountDetail.setPanCardNumber(customerAccountDetails.getPanCardNumber());
		customerAccountDetail.setAadharNumber(customerAccountDetails.getAadharNumber());
		
		
		
		return customerAccountDetailRepository.save(customerAccountDetail);
	}

}
