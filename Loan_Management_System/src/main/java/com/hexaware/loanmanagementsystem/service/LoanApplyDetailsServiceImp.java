package com.hexaware.loanmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.loanmanagementsystem.dto.LoanApplyDetailsDTO;
import com.hexaware.loanmanagementsystem.entity.LoanApplyDetails;
import com.hexaware.loanmanagementsystem.repository.LoanApplyDetailsRepository;

@Service
public class LoanApplyDetailsServiceImp implements ILoanApplyDetailsService {

	@Autowired
	LoanApplyDetailsRepository loanApplyDetailsRepository;
	
	
	
	@Override
	public LoanApplyDetails createLoanApplyDetails(LoanApplyDetailsDTO loanApplyDetailDto) {
		// TODO Auto-generated method stub
		
		LoanApplyDetails loanApplyDetail = new LoanApplyDetails();
		loanApplyDetail.setLoanApplyDate(loanApplyDetailDto.getLoanApplyDate());		
		
		
		return loanApplyDetailsRepository.save(loanApplyDetail);
	}

	@Override
	public LoanApplyDetails updateApplyDetails(LoanApplyDetailsDTO loanApplyDetailDto) {
		// TODO Auto-generated method stub
		LoanApplyDetails loanApplyDetail = new LoanApplyDetails();
		loanApplyDetail.setLoanApplyDate(loanApplyDetailDto.getLoanApplyDate());		
		
		
		return loanApplyDetailsRepository.save(loanApplyDetail);
	}

	@Override
	public void deleteApplyDetails(long loanApplyDetailId) {

		loanApplyDetailsRepository.deleteById(loanApplyDetailId);
		
	}

	@Override
	public LoanApplyDetails getloanDetailsByLoanNumber(long loanApplyDetailId) {
		// TODO Auto-generated method stub
		return loanApplyDetailsRepository.findById(loanApplyDetailId).orElse(new LoanApplyDetails());
	}

	@Override
	public List<LoanApplyDetails> getAllLoanDetails() {
		// TODO Auto-generated method stub
		return loanApplyDetailsRepository.findAll();
	}



}
