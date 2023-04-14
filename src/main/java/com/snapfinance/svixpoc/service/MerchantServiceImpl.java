package com.snapfinance.svixpoc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.snapfinance.svixpoc.entity.Merchant;

@Service
public class MerchantServiceImpl implements MerchantService{
	List<Merchant> merchantList = new ArrayList<Merchant>();
	
	@Override
	public void addMerchant(Merchant merchant) {
		this.merchantList.add(merchant);
	}
	@Override
	public List<Merchant> getMerchants(){
		return this.merchantList;
	}
}
