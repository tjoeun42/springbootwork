package com.study.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.shop.domain.Cart;
import com.study.shop.service.CartService;

@RestController
@RequestMapping("/react")
public class CartController {
	
	@Autowired
	CartService cartService;
	
	@PostMapping("/addCart")
	public String addCart(@RequestBody Cart cart) {
		System.out.println(cart);
		return "ok";
	}

}
