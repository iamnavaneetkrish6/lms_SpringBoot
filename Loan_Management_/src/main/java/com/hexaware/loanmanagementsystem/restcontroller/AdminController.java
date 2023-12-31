package com.hexaware.loanmanagementsystem.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.loanmanagementsystem.dto.AdminDetailsDTO;
import com.hexaware.loanmanagementsystem.entity.AdminDetails;
import com.hexaware.loanmanagementsystem.service.IAdminDetailsService;

@RestController
@RequestMapping("/api/admin/")
public class AdminController {

	private IAdminDetailsService adminDetailsService;

	@Autowired
	public AdminController(IAdminDetailsService adminDetailsService) {
		super();
		this.adminDetailsService = adminDetailsService;
	}

	@PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
	public AdminDetails createAdmin(@RequestBody AdminDetailsDTO adminDetailsDTO) {

		return adminDetailsService.createAdmin(adminDetailsDTO);
	}

	@PutMapping(value = "/update", consumes = "application/json", produces = "application/json")
	public AdminDetails updateAdmin(@RequestBody AdminDetailsDTO adminDetailsDTO) {

		return adminDetailsService.updateAdmin(adminDetailsDTO);
	}

	@DeleteMapping(value = "/delete/{adminID}", consumes = "application/json")
	public String deleteAdmin(@PathVariable long adminID) {

		adminDetailsService.deleteAdmin(adminID);

		return "DELETED : " + adminID;
	}

	@GetMapping(value = "/getbyid/{id}", produces = "application/json")
	public AdminDetails getByAdminId(@PathVariable int id) {

		return adminDetailsService.getAdminById(id);
	}

	@GetMapping(value = "/getAll", produces = "application/json")
	public List<AdminDetails> getAllAdmin() {

		return adminDetailsService.getAllAdmin();
	}

}
