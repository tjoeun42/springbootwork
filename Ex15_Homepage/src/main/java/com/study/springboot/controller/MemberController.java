package com.study.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.study.springboot.domain.Member;
import com.study.springboot.service.MemberService;

@Controller
@SessionAttributes("loginUser")
// @SessionAttributes({"loginUser", "", ""})  sesseion cope가 여러개 일 때
public class MemberController {
	@Autowired
	MemberService mService;
	
	@Autowired
	PasswordEncoder pEncoder;
	
	@RequestMapping("/")
	public String root() {
		return "index";
	}
	
	@GetMapping("/enrollForm")
	public String enrollForm() {
		return "member/enrollForm";
	}
	
	@GetMapping("/idCheck")
	public @ResponseBody boolean idCheck(@RequestParam("id") String id) {
		return mService.idCheck(id);
	}
	
	@PostMapping("/memberInsert")
	public String memberInsert(Member member) {
		// String enPwd = pEncoder.encode(member.getPassword());
		member.setPassword(pEncoder.encode(member.getPassword()));
		mService.insert(member);
		return "redirect:/";
	}

	@PostMapping("/login")
	public String login(Member member, Model model) {
		Member loginUser = mService.login(member); // loginUser != null -> id 있다
		System.out.println("이름 : " + loginUser.getName());
		
		if(loginUser != null && pEncoder.matches(member.getPassword(), loginUser.getPassword())) {
			model.addAttribute("loginUser", loginUser);  // session scope로 바꾸려면 상단에 @SessionAttributes 넣기
			System.out.println("전화 : " + loginUser.getPhone());
		}
		return "redirect:/";
	}
}
