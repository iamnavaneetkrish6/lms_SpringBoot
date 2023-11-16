package com.hexaware.loanmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hexaware.loanmanagementsystem.dto.CustomerLoanHistoryDTO;
import com.hexaware.loanmanagementsystem.entity.CustomerLoanHistory;
import com.hexaware.loanmanagementsystem.repository.CustomerLoanHistoryRepository;

public class CustomerLoanHistoryServiceImp implements ICustomerLoanHistoryService {

	
	private  CustomerLoanHistoryRepository customerLoanHistoryRepository;

		
	@Autowired
	public CustomerLoanHistoryServiceImp(CustomerLoanHistoryRepository customerLoanHistoryRepository) {
		super();
		this.customerLoanHistoryRepository = customerLoanHistoryRepository;
	}

	@Override
	public CustomerLoanHistory createLoanHistory(CustomerLoanHistoryDTO customerLoanHistoryDto) {

		CustomerLoanHistory customerLoanHistory = new CustomerLoanHistory();
		customerLoanHistory.setLoanOrginationDate(customerLoanHistoryDto.getLoanOrginationDate());
		customerLoanHistory.setLoanAmount(customerLoanHistoryDto.getLoanAmount());
		customerLoanHistory.setLoanRepaymentStatus(customerLoanHistoryDto.getLoanRepaymentStatus());

		return customerLoanHistoryRepository.save(customerLoanHistory);
	}

	@Override
	public CustomerLoanHistory updateLoanHistory(CustomerLoanHistoryDTO customerLoanHistoryDto) {
		CustomerLoanHistory customerLoanHistory = new CustomerLoanHistory();
		customerLoanHistory.setLoanOrginationDate(customerLoanHistoryDto.getLoanOrginationDate());
		customerLoanHistory.setLoanAmount(customerLoanHistoryDto.getLoanAmount());
		customerLoanHistory.setLoanRepaymentStatus(customerLoanHistoryDto.getLoanRepaymentStatus());

		return customerLoanHistoryRepository.save(customerLoanHistory);
	}

	@Override
	public void deleteLoanHistory(long customerloanHistoryId) {

		customerLoanHistoryRepository.deleteById(customerloanHistoryId);

	}

	@Override
	public CustomerLoanHistory getLoanHistoryByLoanNumber(long customerloanHistoryId) {
		// TODO Auto-generated method stub
		return customerLoanHistoryRepository.findById(customerloanHistoryId).orElse(new CustomerLoanHistory());
	}

	@Override
	public List<CustomerLoanHistory> getAllLoanHistoryByCustomerId() {
		// TODO Auto-generated method stub
		return customerLoanHistoryRepository.findAll();
	}

}
