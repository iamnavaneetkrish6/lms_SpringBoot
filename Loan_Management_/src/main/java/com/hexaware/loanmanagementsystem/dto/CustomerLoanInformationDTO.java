package com.hexaware.loanmanagementsystem.dto;

import java.time.LocalDate;

public class CustomerLoanInformationDTO {

	private long loanInformationID;
	private long loanAmount;
	private long loanTerm;
	private LocalDate loanOrginationDate;
	
	private CustomerDetailsDTO customerDetails;
	
	private LoanStatusDTO loanStatus;
	
	
	
	
	public CustomerLoanInformationDTO() {
		// TODO Auto-generated constructor stub
	}




	public long getLoanInformationID() {
		return loanInformationID;
	}




	public void setLoanInformationID(long loanInformationID) {
		this.loanInformationID = loanInformationID;
	}




	public long getLoanAmount() {
		return loanAmount;
	}




	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}




	public long getLoanTerm() {
		return loanTerm;
	}




	public void setLoanTerm(long loanTerm) {
		this.loanTerm = loanTerm;
	}




	public LocalDate getLoanOrginationDate() {
		return loanOrginationDate;
	}




	public void setLoanOrginationDate(LocalDate loanOrginationDate) {
		this.loanOrginationDate = loanOrginationDate;
	}




	public CustomerDetailsDTO getCustomerDetails() {
		return customerDetails;
	}




	public void setCustomerDetails(CustomerDetailsDTO customerDetails) {
		this.customerDetails = customerDetails;
	}




	public LoanStatusDTO getLoanStatus() {
		return loanStatus;
	}




	public void setLoanStatus(LoanStatusDTO loanStatus) {
		this.loanStatus = loanStatus;
	}

	
	
	
}
