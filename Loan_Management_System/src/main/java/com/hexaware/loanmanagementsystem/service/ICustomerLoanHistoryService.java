package com.hexaware.loanmanagementsystem.service;

import java.util.List;

import com.hexaware.loanmanagementsystem.dto.CustomerLoanHistoryDTO;
import com.hexaware.loanmanagementsystem.entity.CustomerLoanHistory;

public interface ICustomerLoanHistoryService {

	CustomerLoanHistory createLoanHistory(CustomerLoanHistoryDTO customerloanHistoryDto);

	CustomerLoanHistory updateLoanHistory(CustomerLoanHistoryDTO customerloanHistoryDto);

	void deleteLoanHistory(long loanNo);

	CustomerLoanHistory getLoanHistoryByLoanNumber(long customerloanHistoryId);

	List<CustomerLoanHistory> getAllLoanHistoryByCustomerId();

}
