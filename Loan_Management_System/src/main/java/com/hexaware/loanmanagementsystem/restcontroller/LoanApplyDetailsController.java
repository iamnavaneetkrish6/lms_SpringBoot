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

import com.hexaware.loanmanagementsystem.dto.LoanApplyDetailsDTO;
import com.hexaware.loanmanagementsystem.entity.LoanApplyDetails;
import com.hexaware.loanmanagementsystem.service.LoanApplyDetailsServiceImp;

@RestController
@RequestMapping("/api/loan-service/")
public class LoanApplyDetailsController {

	private LoanApplyDetailsServiceImp loanService;

	@Autowired
	public LoanApplyDetailsController(LoanApplyDetailsServiceImp loanService) {
		super();
		this.loanService = loanService;
	}

	@PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
	public LoanApplyDetails createAdmin(@RequestBody LoanApplyDetailsDTO loanApplyDetailsDTO) {

		return loanService.createLoanApplyDetails(loanApplyDetailsDTO);
	}

	@PutMapping(value = "/update", consumes = "application/json", produces = "application/json")
	public LoanApplyDetails updateAdmin(@RequestBody LoanApplyDetailsDTO loanApplyDetailsDTO) {

		return loanService.updateApplyDetails(loanApplyDetailsDTO);
	}

	@DeleteMapping(value = "/delete/{ID}", consumes = "application/json")
	public String deleteAdmin(@PathVariable long ID) {

		loanService.deleteApplyDetails(ID);

		return "DELETED : ";
	}

	@GetMapping(value = "/getbyid/{id}", produces = "application/json")
	public LoanApplyDetails getByAdminId(@PathVariable int id) {

		return loanService.getloanDetailsByLoanNumber(id);
	}

	@GetMapping(value = "/getAll", produces = "application/json")
	public List<LoanApplyDetails> getAllAdmin() {

		return loanService.getAllLoanDetails();
	}

}
