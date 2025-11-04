package com.study.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.study.springboot.service.BoardService;

@Controller
@SessionAttributes("loginUser")
public class BoardController {

	@Autowired
	BoardService bService;
	
	@GetMapping("/insertForm")
	public String insertForm(Model model) {
		model.addAttribute("loginUser", loginUser);
		return "board/insertForm";
	}
}
