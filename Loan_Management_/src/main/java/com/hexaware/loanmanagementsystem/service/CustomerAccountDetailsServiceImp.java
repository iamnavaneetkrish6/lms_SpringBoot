package com.hexaware.loanmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.loanmanagementsystem.dto.CustomerAccountDetailsDTO;
import com.hexaware.loanmanagementsystem.entity.CustomerAccountDetails;
import com.hexaware.loanmanagementsystem.repository.CustomerAccountDetailsRepository;

@Service
public class CustomerAccountDetailsServiceImp implements ICustomerAccountDetailsService {

	
	CustomerAccountDetailsRepository customerAccountDetailRepository;

	
	

	@Autowired
	public CustomerAccountDetailsServiceImp(CustomerAccountDetailsRepository customerAccountDetailRepository) {
		super();
		this.customerAccountDetailRepository = customerAccountDetailRepository;
	}

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

	public CustomerAccountDetails addCustomerAccountDetail(CustomerAccountDetailsDTO customerAccountDetailsDTO) {
		CustomerAccountDetails customerAccountDetail = new CustomerAccountDetails();
		customerAccountDetail.setAccountNumber(customerAccountDetailsDTO.getAccountNumber());
		customerAccountDetail.setBankName(customerAccountDetailsDTO.getBankName());
		customerAccountDetail.setPanCardNumber(customerAccountDetailsDTO.getPanCardNumber());
		customerAccountDetail.setAadharNumber(customerAccountDetailsDTO.getAadharNumber());
		
		
		
		return customerAccountDetailRepository.save(customerAccountDetail);
	}

}
