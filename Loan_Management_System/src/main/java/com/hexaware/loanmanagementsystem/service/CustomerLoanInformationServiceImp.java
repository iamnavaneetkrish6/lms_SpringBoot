package com.hexaware.loanmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.loanmanagementsystem.dto.CustomerLoanInformationDTO;
import com.hexaware.loanmanagementsystem.entity.CustomerLoanInformation;
import com.hexaware.loanmanagementsystem.repository.CustomerLoanInformationRepository;

@Service
public class CustomerLoanInformationServiceImp implements ICustomerLoanInformationService {

	@Autowired
	CustomerLoanInformationRepository customerLoanInformationRepository;

	@Override
	public CustomerLoanInformation createCustomerLoanInformation(
			CustomerLoanInformationDTO customerLoanInformationDto) {

		CustomerLoanInformation customerLoanInformation = new CustomerLoanInformation();
		customerLoanInformation.setLoanAmount(customerLoanInformationDto.getLoanAmount());
		customerLoanInformation.setLoanTerm(customerLoanInformationDto.getLoanTerm());
		customerLoanInformation.setLoanOrginationDate(customerLoanInformationDto.getLoanOrginationDate());

		return customerLoanInformationRepository.save(customerLoanInformation);
	}

	@Override
	public CustomerLoanInformation updateCustomerLoanInformation(
			CustomerLoanInformationDTO customerLoanInformationDto) {
		CustomerLoanInformation customerLoanInformation = new CustomerLoanInformation();
		customerLoanInformation.setLoanAmount(customerLoanInformationDto.getLoanAmount());
		customerLoanInformation.setLoanTerm(customerLoanInformationDto.getLoanTerm());
		customerLoanInformation.setLoanOrginationDate(customerLoanInformationDto.getLoanOrginationDate());

		return customerLoanInformationRepository.save(customerLoanInformation);
	}

	@Override
	public void deleteCustomerLoanInformation(long customerLoanInformationID) {

		customerLoanInformationRepository.deleteById(customerLoanInformationID);

	}

	@Override
	public CustomerLoanInformation getCustomerLoanInformationByLoanNumber(long customerLoanInformationID) {

		return customerLoanInformationRepository.findById(customerLoanInformationID)
				.orElse(new CustomerLoanInformation());
	}

	@Override
	public List<CustomerLoanInformation> getAllCustomerLoanInformation() {
		return customerLoanInformationRepository.findAll();
	}

}
