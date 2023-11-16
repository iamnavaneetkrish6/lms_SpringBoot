package com.hexaware.loanmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.loanmanagementsystem.entity.AdminDetails;

@Repository
public interface AdminDetailsRepository extends JpaRepository<AdminDetails, Long> {
 
}
