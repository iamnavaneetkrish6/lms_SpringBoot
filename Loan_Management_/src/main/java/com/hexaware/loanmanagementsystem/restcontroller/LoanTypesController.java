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

import com.hexaware.loanmanagementsystem.dto.LoanTypesDTO;
import com.hexaware.loanmanagementsystem.entity.LoanTypes;
import com.hexaware.loanmanagementsystem.service.ILoanTypesService;

@RestController
@RequestMapping("/api/loan-types/")
public class LoanTypesController {

	private ILoanTypesService loanTypesService;

	@Autowired
	public LoanTypesController(ILoanTypesService loanTypesService) {
		super();
		this.loanTypesService = loanTypesService;
	}

	@PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
	public LoanTypes createLoanTypes(@RequestBody LoanTypesDTO loanTypesDTO) {

		return loanTypesService.createLoanType(loanTypesDTO);
	}

	@PutMapping(value = "/update", consumes = "application/json", produces = "application/json")
	public LoanTypes updateLoanTypes(@RequestBody LoanTypesDTO loanTypesDTO) {

		return loanTypesService.updateLoanType(loanTypesDTO);
	}

	@DeleteMapping(value = "/delete/{ID}", consumes = "application/json")
	public String deleteLoanTypes(@PathVariable long ID) {

		loanTypesService.deleteLoanTypeById(ID);

		return "DELETED : ";
	}

	@GetMapping(value = "/getbyid/{id}", produces = "application/json")
	public LoanTypes getLoanTypeById(@PathVariable int id) {

		return loanTypesService.getLoanTypeById(id);
	}

	@GetMapping(value = "/getAll", produces = "application/json")
	public List<LoanTypes> getAllLoanType() {

		return loanTypesService.getAllLoanType();
	}

}
