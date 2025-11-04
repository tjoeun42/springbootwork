package com.study.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.repository.ReplyRepository;

@Service
public class ReplyService {

	@Autowired
	ReplyRepository rRepository;
}
