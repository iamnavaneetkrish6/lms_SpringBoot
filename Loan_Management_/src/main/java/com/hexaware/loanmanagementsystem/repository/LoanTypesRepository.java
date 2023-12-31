package com.hexaware.loanmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.loanmanagementsystem.entity.LoanTypes;

@Repository
public interface LoanTypesRepository extends JpaRepository<LoanTypes, Long> {

}
