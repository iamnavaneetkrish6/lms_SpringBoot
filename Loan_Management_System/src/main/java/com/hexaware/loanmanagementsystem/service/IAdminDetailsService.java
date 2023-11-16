package com.hexaware.loanmanagementsystem.service;

import java.util.List;

import com.hexaware.loanmanagementsystem.dto.AdminDetailsDTO;
import com.hexaware.loanmanagementsystem.entity.AdminDetails;



public interface IAdminDetailsService {

	AdminDetails createAdmin(AdminDetailsDTO adminDetails);
	AdminDetails updateAdmin(AdminDetailsDTO adminDetails);
	
	void deleteAdmin(long adminId);
	
	AdminDetails getAdminById (long adminId);
	List<AdminDetails> getAllAdmin();
}
