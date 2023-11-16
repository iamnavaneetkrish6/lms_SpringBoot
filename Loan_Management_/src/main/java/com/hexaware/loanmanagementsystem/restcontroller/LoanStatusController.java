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

import com.hexaware.loanmanagementsystem.dto.LoanStatusDTO;
import com.hexaware.loanmanagementsystem.entity.LoanStatus;
import com.hexaware.loanmanagementsystem.service.ILoanStatusService;

@RestController
@RequestMapping("/api/loan-status/")
public class LoanStatusController {

	private ILoanStatusService loanStatusService;

	@Autowired
	public LoanStatusController(ILoanStatusService loanStatusService) {
		super();
		this.loanStatusService = loanStatusService;
	}

	@PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
	public LoanStatus createLoanStatus(@RequestBody LoanStatusDTO loanStatusDTO) {

		return loanStatusService.createLoanStatus(loanStatusDTO);
	}

	@PutMapping(value = "/update", consumes = "application/json", produces = "application/json")
	public LoanStatus updateLoanStatus(@RequestBody LoanStatusDTO loanStatusDTO) {

		return loanStatusService.updateLoanStatus(loanStatusDTO);
	}

	@DeleteMapping(value = "/delete/{ID}", consumes = "application/json")
	public String deleteLoanStatus(@PathVariable long ID) {

		loanStatusService.deleteLoanStatus(ID);

		return "DELETED : ";
	}

	@GetMapping(value = "/getbyid/{id}", produces = "application/json")
	public LoanStatus getLoanStatusById(@PathVariable int id) {

		return loanStatusService.getLoanStatusByLoanNumber(id);
	}

	@GetMapping(value = "/getAll", produces = "application/json")
	public List<LoanStatus> getAllLoanStatus() {

		return loanStatusService.getAllLoanStatus();
	}

}
