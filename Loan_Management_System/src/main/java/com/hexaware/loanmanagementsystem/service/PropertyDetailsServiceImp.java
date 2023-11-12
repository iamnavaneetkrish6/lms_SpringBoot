package com.hexaware.loanmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.loanmanagementsystem.dto.PropertyDetailsDTO;
import com.hexaware.loanmanagementsystem.entity.PropertyDetails;
import com.hexaware.loanmanagementsystem.repository.PropertyDetailsRepository;

@Service
public class PropertyDetailsServiceImp implements IPropertyDetailsService {

	@Autowired
	PropertyDetailsRepository propertyDetailsRepository;

	@Override
	public PropertyDetails createpropertyDetails(PropertyDetailsDTO propertyDetailDto) {

		PropertyDetails propertyDetail = new PropertyDetails();
		propertyDetail.setPropertyOwner(propertyDetailDto.getPropertyOwner());
		propertyDetail.setPropertyAddress(propertyDetailDto.getPropertyAddress());
		propertyDetail.setPropertyValue(propertyDetailDto.getPropertyValue());

		return propertyDetailsRepository.save(propertyDetail);
	}

	@Override
	public PropertyDetails updatepropertyDetails(PropertyDetailsDTO propertyDetailDto) {
		PropertyDetails propertyDetail = new PropertyDetails();
		propertyDetail.setPropertyOwner(propertyDetailDto.getPropertyOwner());
		propertyDetail.setPropertyAddress(propertyDetailDto.getPropertyAddress());
		propertyDetail.setPropertyValue(propertyDetailDto.getPropertyValue());

		return propertyDetailsRepository.save(propertyDetail);
	}

	@Override
	public void deletepropertyDetailsById(long propertyDetailsId) {

		propertyDetailsRepository.deleteById(propertyDetailsId);

	}

	@Override
	public PropertyDetails getpropertyDetailsId(long propertyDetailsId) {
		// TODO Auto-generated method stub
		return propertyDetailsRepository.findById(propertyDetailsId).orElse(new PropertyDetails());
	}

	@Override
	public List<PropertyDetails> getAllPropertyDetails() {
		// TODO Auto-generated method stub
		return propertyDetailsRepository.findAll();
	}

}
