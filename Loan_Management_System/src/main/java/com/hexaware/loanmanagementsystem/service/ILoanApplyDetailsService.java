package com.hexaware.loanmanagementsystem.service;

import java.util.List;

import com.hexaware.loanmanagementsystem.dto.LoanApplyDetailsDTO;
import com.hexaware.loanmanagementsystem.entity.LoanApplyDetails;


public interface ILoanApplyDetailsService {

	LoanApplyDetails createLoanApplyDetails(LoanApplyDetailsDTO loanApplyDetailDto);
	LoanApplyDetails updateApplyDetails (LoanApplyDetailsDTO loanApplyDetailDto);
	
	void deleteApplyDetails(long loanApplyDetailId);
	
	LoanApplyDetails getloanDetailsByLoanNumber(long loanApplyDetailId);
	List<LoanApplyDetails> getAllLoanDetails();
	
	
}
