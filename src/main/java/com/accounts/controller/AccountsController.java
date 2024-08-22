package com.accounts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accounts.entity.Accounts;
import com.accounts.service.AccountService;

@RestController
public class AccountsController {
	
	@Autowired
	AccountService accountService;
	
	@PostMapping("/save-account")
	public String savedata(@RequestBody Accounts entity) {
		accountService.save(entity);
		return "data save successfully By Account No: "+entity.getAccountNumber();
				
	}
	
	@PostMapping("/myaccount")
	public List<Accounts> getAccountswithCustomerId(@RequestBody Accounts entity) {
	List<Accounts> accountList=	accountService.getAccountsByCustomerId(entity.getCustomerId());;
		return accountList;
	}

}
