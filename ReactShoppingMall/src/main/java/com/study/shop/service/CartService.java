package com.study.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.shop.repository.CartRepository;

@Service
public class CartService {
	
	@Autowired
	CartRepository cartRepository;
}
