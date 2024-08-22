package com.accounts.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accounts.entity.Accounts;

public interface AccountsRepository extends JpaRepository<Accounts, Integer>{
	
	List<Accounts> findByCustomerId(int customerId);

}
