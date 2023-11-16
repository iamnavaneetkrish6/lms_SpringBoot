package com.hexaware.loanmanagementsystem.dto;

import java.time.LocalDate;

public class CustomerLoanHistoryDTO {

	private long loanNo;
	private LocalDate loanOrginationDate;
	private long loanAmount;
	private String loanRepaymentStatus;
	
	
	private CustomerDetailsDTO customerDetails;


	public long getLoanNo() {
		return loanNo;
	}


	public void setLoanNo(long loanNo) {
		this.loanNo = loanNo;
	}


	public LocalDate getLoanOrginationDate() {
		return loanOrginationDate;
	}


	public void setLoanOrginationDate(LocalDate loanOrginationDate) {
		this.loanOrginationDate = loanOrginationDate;
	}


	public long getLoanAmount() {
		return loanAmount;
	}


	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}


	public String getLoanRepaymentStatus() {
		return loanRepaymentStatus;
	}


	public void setLoanRepaymentStatus(String loanRepaymentStatus) {
		this.loanRepaymentStatus = loanRepaymentStatus;
	}


	public CustomerDetailsDTO getCustomerDetails() {
		return customerDetails;
	}


	public void setCustomerDetails(CustomerDetailsDTO customerDetails) {
		this.customerDetails = customerDetails;
	}
	
	
	
}
