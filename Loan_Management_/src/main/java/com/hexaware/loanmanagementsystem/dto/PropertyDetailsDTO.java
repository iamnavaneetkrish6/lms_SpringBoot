package com.hexaware.loanmanagementsystem.dto;

public class PropertyDetailsDTO {

	private long propertyId;
	private String propertyOwner;
	private String propertyAddress;
	private double propertyValue;

	private LoanApplyDetailsDTO loanApplyDetails;

	public PropertyDetailsDTO() {
		// TODO Auto-generated constructor stub
	}

	public long getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(long propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyOwner() {
		return propertyOwner;
	}

	public void setPropertyOwner(String propertyOwner) {
		this.propertyOwner = propertyOwner;
	}

	public String getPropertyAddress() {
		return propertyAddress;
	}

	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public double getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(double propertyValue) {
		this.propertyValue = propertyValue;
	}

	public LoanApplyDetailsDTO getLoanApplyDetails() {
		return loanApplyDetails;
	}

	public void setLoanApplyDetails(LoanApplyDetailsDTO loanApplyDetails) {
		this.loanApplyDetails = loanApplyDetails;
	}

}
