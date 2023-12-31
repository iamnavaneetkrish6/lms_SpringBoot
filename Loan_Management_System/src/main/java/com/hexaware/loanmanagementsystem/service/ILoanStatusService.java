package com.hexaware.loanmanagementsystem.service;

import java.util.List;

import com.hexaware.loanmanagementsystem.dto.LoanStatusDTO;
import com.hexaware.loanmanagementsystem.entity.LoanStatus;



public interface ILoanStatusService {

	LoanStatus createLoanStatus(LoanStatusDTO loanStatus);
	LoanStatus updateLoanStatus(LoanStatusDTO loanStatus);
	
	void deleteLoanStatus(long loanStatusID);
	
	LoanStatus getLoanStatusByLoanNumber (long loanNo);
	List<LoanStatus> getAllLoanStatus();
	
	
}
