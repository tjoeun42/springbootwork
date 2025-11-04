package com.study.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.study.springboot.service.ReplyService;

@Controller
public class ReplyController {
	
	@Autowired
	ReplyService rService;
}
