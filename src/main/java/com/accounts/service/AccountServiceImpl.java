package com.accounts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accounts.entity.Accounts;
import com.accounts.repo.AccountsRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountsRepository repo;
	
	@Override
	public Accounts save(Accounts entity) {
		// TODO Auto-generated method stub
		return repo.save(entity);
	}

	@Override
	public List<Accounts> getAccountsByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		return repo.findByCustomerId(customerId);
	}

}
