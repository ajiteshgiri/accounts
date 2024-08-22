package com.accounts.service;

import java.util.List;

import com.accounts.entity.Accounts;


public interface AccountService {
	
	Accounts save(Accounts entity);
	List<Accounts> getAccountsByCustomerId(int customerId);
	

}
