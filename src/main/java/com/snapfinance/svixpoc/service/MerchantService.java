package com.snapfinance.svixpoc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.snapfinance.svixpoc.entity.Merchant;

@Service
public interface MerchantService {
	public void addMerchant(Merchant merchant);
	public List<Merchant> getMerchants();
}
