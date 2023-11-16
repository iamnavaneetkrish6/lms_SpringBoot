package com.hexaware.loanmanagementsystem.dto;

import java.time.LocalDate;

public class LoanApplyDetailsDTO {

	private long loanNo;
	private long loanTypeId;
	private double loanAmount;
	private LocalDate loanApplyDate;
	private String propertyAddress;
	private long CustomerId;

	private CustomerDetailsDTO customerDetails;
	

	private PropertyDetailsDTO propertyDetails;
	
	private LoanTypesDTO  loanTypes;
	
	private CustomerAccountDetailsDTO customerAccountDetails;

	public long getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(long loanNo) {
		this.loanNo = loanNo;
	}

	public long getLoanTypeId() {
		return loanTypeId;
	}

	public void setLoanTypeId(long loanTypeId) {
		this.loanTypeId = loanTypeId;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public LocalDate getLoanApplyDate() {
		return loanApplyDate;
	}

	public void setLoanApplyDate(LocalDate loanApplyDate) {
		this.loanApplyDate = loanApplyDate;
	}

	public String getPropertyAddress() {
		return propertyAddress;
	}

	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public long getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(long customerId) {
		CustomerId = customerId;
	}

	public CustomerDetailsDTO getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetailsDTO customerDetails) {
		this.customerDetails = customerDetails;
	}

	public PropertyDetailsDTO getPropertyDetails() {
		return propertyDetails;
	}

	public void setPropertyDetails(PropertyDetailsDTO propertyDetails) {
		this.propertyDetails = propertyDetails;
	}

	public LoanTypesDTO getLoanTypes() {
		return loanTypes;
	}

	public void setLoanTypes(LoanTypesDTO loanTypes) {
		this.loanTypes = loanTypes;
	}

	public CustomerAccountDetailsDTO getCustomerAccountDetails() {
		return customerAccountDetails;
	}

	public void setCustomerAccountDetails(CustomerAccountDetailsDTO customerAccountDetails) {
		this.customerAccountDetails = customerAccountDetails;
	}


	
	
}
