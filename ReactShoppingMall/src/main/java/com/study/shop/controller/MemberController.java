package com.study.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.shop.service.MemberService;

@RestController
@RequestMapping("/react")
public class MemberController {
	@Autowired
	MemberService memberService;
	
	@GetMapping("/email-check")
	public boolean emailCheck(@RequestParam(value="email") String email) {
		System.out.println(email);
		return !memberService.emailCheck(email);
	}
	
	
}
