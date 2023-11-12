package com.hexaware.loanmanagementsystem.dto;

public class LoanStatusDTO {

	private long loanStatusId;
	private String loanStatus;

	private LoanApplyDetailsDTO loanApplyDetails;
	private CustomerDetailsDTO customerDetails;

	public long getLoanStatusId() {
		return loanStatusId;
	}

	public void setLoanStatusId(long loanStatusId) {
		this.loanStatusId = loanStatusId;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public LoanApplyDetailsDTO getLoanApplyDetails() {
		return loanApplyDetails;
	}

	public void setLoanApplyDetails(LoanApplyDetailsDTO loanApplyDetails) {
		this.loanApplyDetails = loanApplyDetails;
	}

	public CustomerDetailsDTO getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetailsDTO customerDetails) {
		this.customerDetails = customerDetails;
	}

}
