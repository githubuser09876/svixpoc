package com.snapfinance.svixpoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.snapfinance.svixpoc.entity.Merchant;
import com.snapfinance.svixpoc.service.MerchantServiceImpl;

@RestController
public class MerchantController {

	@Autowired
	MerchantServiceImpl merchantServiceImpl;
	
	@PostMapping("/api/addMerchant")
	@CrossOrigin
	public void addMerchant(@RequestBody Merchant merchant) {
		this.merchantServiceImpl.addMerchant(merchant);
}
	@GetMapping("/api/getMerchants")
	@CrossOrigin
	public List<Merchant> getMerchants(){
		return this.merchantServiceImpl.getMerchants();
	}
}
