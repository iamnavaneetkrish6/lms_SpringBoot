package com.hexaware.loanmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.loanmanagementsystem.entity.LoanStatus;

@Repository
public interface LoanStatusRepository extends JpaRepository<LoanStatus, Long> {

}
