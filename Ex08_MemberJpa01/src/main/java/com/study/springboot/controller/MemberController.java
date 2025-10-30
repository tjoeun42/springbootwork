package com.study.springboot.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.springboot.domain.Member;
import com.study.springboot.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	MemberService mService;
	
	@RequestMapping("/")
	public String root() {
		return "menu";
	}
	
	@GetMapping("/insert")
	public String insert(@RequestParam("username") String name, Model model) {
		Member member = Member.builder()
							  .username(name)
							  .createDate(LocalDate.now())
							  .build();
		Member result = mService.insert(member);
		model.addAttribute("member", result);
		return "insert";
	}
}
