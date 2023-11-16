package com.hexaware.loanmanagementsystem.entity;
/*
 * Author: Navaneethakrishnan & Aniket Singh Tomar
 * Date : 10/11/2023            
 *                  
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class PropertyDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long propertyId;
	private String propertyOwner;
	private String propertyAddress;
	private double propertyValue;

	@OneToOne(mappedBy = "propertyDetails")
	private LoanApplyDetails loanApplyDetails;

	public PropertyDetails() {
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

	public LoanApplyDetails getLoanApplyDetails() {
		return loanApplyDetails;
	}

	public void setLoanApplyDetails(LoanApplyDetails loanApplyDetails) {
		this.loanApplyDetails = loanApplyDetails;
	}

}
