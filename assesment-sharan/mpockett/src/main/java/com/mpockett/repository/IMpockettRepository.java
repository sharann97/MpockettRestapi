package com.mpockett.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpockett.model.Loan;

@Repository
public interface IMpockettRepository extends JpaRepository<Loan, Integer>{
	
	List<Loan>findALL();
	Loan findById(int loanId);
	List<Loan> findByLoanName(String loanName);
	

}
