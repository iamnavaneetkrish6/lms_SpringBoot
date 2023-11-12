package com.hexaware.loanmanagementsystem.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class LoanTypes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long loanTypeId;
	private String loanTypeName;
	private double loanInterestRate;
	private int loanTerm;
	private String loanDescription;
	private int loanManagementFees;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "loanTypes")
	private Set<LoanApplyDetails> loanApplyDetails;

	public long getLoanTypeId() {
		return loanTypeId;
	}

	public void setLoanTypeId(long loanTypeId) {
		this.loanTypeId = loanTypeId;
	}

	public String getLoanTypeName() {
		return loanTypeName;
	}

	public void setLoanTypeName(String loanTypeName) {
		this.loanTypeName = loanTypeName;
	}

	public double getLoanInterestRate() {
		return loanInterestRate;
	}

	public void setLoanInterestRate(double loanInterestRate) {
		this.loanInterestRate = loanInterestRate;
	}

	public int getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}

	public String getLoanDescription() {
		return loanDescription;
	}

	public void setLoanDescription(String loanDescription) {
		this.loanDescription = loanDescription;
	}

	public int getLoanManagementFees() {
		return loanManagementFees;
	}

	public void setLoanManagementFees(int loanManagementFees) {
		this.loanManagementFees = loanManagementFees;
	}

	public Set<LoanApplyDetails> getLoanApplyDetails() {
		return loanApplyDetails;
	}

	public void setLoanApplyDetails(Set<LoanApplyDetails> loanApplyDetails) {
		this.loanApplyDetails = loanApplyDetails;
	}

}
