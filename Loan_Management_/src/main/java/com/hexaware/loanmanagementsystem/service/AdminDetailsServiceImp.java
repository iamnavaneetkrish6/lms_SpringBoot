package com.hexaware.loanmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.loanmanagementsystem.dto.AdminDetailsDTO;
import com.hexaware.loanmanagementsystem.entity.AdminDetails;
import com.hexaware.loanmanagementsystem.repository.AdminDetailsRepository;

@Service
public class AdminDetailsServiceImp implements IAdminDetailsService {

	
	AdminDetailsRepository adminDetailsRepository;
	

	@Autowired
	public AdminDetailsServiceImp(AdminDetailsRepository adminDetailsRepository) {
		super();
		this.adminDetailsRepository = adminDetailsRepository;
	}

	@Override
	public AdminDetails createAdmin(AdminDetailsDTO adminDetails) {

		AdminDetails adminDetail = new AdminDetails();
		adminDetail.setAdminName(adminDetails.getAdminName());
		adminDetail.setAdminUsername(adminDetails.getAdminName());
		adminDetail.setEmailId(adminDetails.getEmailId());
		adminDetail.setPassword(adminDetails.getPassword());
		
		
		return adminDetailsRepository.save(adminDetail);
	}

	@Override
	public AdminDetails updateAdmin(AdminDetailsDTO adminDetails) {

		AdminDetails adminDetail = new AdminDetails();
		adminDetail.setAdminId(adminDetails.getAdminId());
		adminDetail.setAdminName(adminDetails.getAdminName());
		adminDetail.setAdminUsername(adminDetails.getAdminName());
		adminDetail.setEmailId(adminDetails.getEmailId());
		adminDetail.setPassword(adminDetails.getPassword());
		
		return adminDetailsRepository.save(adminDetail);
	}

	@Override
	public void deleteAdmin(long adminID) {

		adminDetailsRepository.deleteById(adminID);
		
	}

	@Override
	public AdminDetails getAdminById(long adminId) {

		
		return adminDetailsRepository.findById(adminId).orElse(new AdminDetails());
	}

	@Override
	public List<AdminDetails> getAllAdmin() {

		
		return adminDetailsRepository.findAll();
	}

}
