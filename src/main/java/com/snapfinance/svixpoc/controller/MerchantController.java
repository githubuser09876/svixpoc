package com.snapfinance.svixpoc.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.snapfinance.svixpoc.entity.Merchant;
import com.snapfinance.svixpoc.service.MerchantServiceImpl;

@RestController
@CrossOrigin
public class MerchantController {

	Logger logger = LoggerFactory.getLogger(MerchantController.class);
	@Autowired
	MerchantServiceImpl merchantServiceImpl;
	
	
	@PostMapping("/add")
	public ResponseEntity<HttpStatus> addMerchant(@RequestBody Merchant merchant) {
		logger.info("Add Method Hit");
		try{
			this.merchantServiceImpl.addMerchant(merchant);
			return new ResponseEntity<>( HttpStatus.OK );
		}catch(Exception ex) {
			logger.error(ex.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
	@GetMapping("/api/getMerchants")
	public List<Merchant> getMerchants(){
		return this.merchantServiceImpl.getMerchants();
	}
	
	@GetMapping("/works")
	public String works(){
		return "It works";
	}
	
	
}
