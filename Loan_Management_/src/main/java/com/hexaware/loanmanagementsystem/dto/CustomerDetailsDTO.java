package com.hexaware.loanmanagementsystem.dto;

public class CustomerDetailsDTO {

	private long customerId;
	private String customerName;
	private String customerUsername;
	private String customerPassword;
	private String customerAddress;
	private String customerState;
	private String customerCountry;
	private String customerEmailId;

	

	private LoanApplyDetailsDTO loanApplyDetails;



	public long getCustomerId() {
		return customerId;
	}



	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getCustomerUsername() {
		return customerUsername;
	}



	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}



	public String getCustomerPassword() {
		return customerPassword;
	}



	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}



	public String getCustomerAddress() {
		return customerAddress;
	}



	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}



	public String getCustomerState() {
		return customerState;
	}



	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}



	public String getCustomerCountry() {
		return customerCountry;
	}



	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}



	public String getCustomerEmailId() {
		return customerEmailId;
	}



	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}



	public LoanApplyDetailsDTO getLoanApplyDetails() {
		return loanApplyDetails;
	}



	public void setLoanApplyDetails(LoanApplyDetailsDTO loanApplyDetails) {
		this.loanApplyDetails = loanApplyDetails;
	}
	
	
	

}
