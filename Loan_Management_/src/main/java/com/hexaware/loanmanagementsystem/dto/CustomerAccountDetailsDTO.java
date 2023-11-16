package com.hexaware.loanmanagementsystem.dto;

public class CustomerAccountDetailsDTO {

	private long AccountDetailsId;
	private long AccountNumber;
	private String BankName;
	private String PanCardNumber;
	private long AadharNumber;
	
	private CustomerDetailsDTO customerDetails;
	
	
	
	public CustomerAccountDetailsDTO() {
		// TODO Auto-generated constructor stub
	}



	public long getAccountDetailsId() {
		return AccountDetailsId;
	}



	public void setAccountDetailsId(long accountDetailsId) {
		AccountDetailsId = accountDetailsId;
	}



	public long getAccountNumber() {
		return AccountNumber;
	}



	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}



	public String getBankName() {
		return BankName;
	}



	public void setBankName(String bankName) {
		BankName = bankName;
	}



	public String getPanCardNumber() {
		return PanCardNumber;
	}



	public void setPanCardNumber(String panCardNumber) {
		PanCardNumber = panCardNumber;
	}



	public long getAadharNumber() {
		return AadharNumber;
	}



	public void setAadharNumber(long aadharNumber) {
		AadharNumber = aadharNumber;
	}



	public CustomerDetailsDTO getCustomerDetails() {
		return customerDetails;
	}



	public void setCustomerDetails(CustomerDetailsDTO customerDetails) {
		this.customerDetails = customerDetails;
	}

	
	
}
