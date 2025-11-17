package com.study.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.springboot.domain.Board;
import com.study.springboot.repository.BoardRepository;

@RestController
@RequestMapping("/rest")
public class BoardRestController {
	@Autowired
	BoardRepository bRepository;
	
	@GetMapping("/boards")
	List<Board> all() {
		return bRepository.findAll();
	}
	
	// http://localhost:8080/rest/boards?title=제목2
	
	// http://localhost:8080/rest/boards?title=제목2&content=내용2
	
	// http://localhost:8080/rest/boards/제목2/content/내용2
	
	// http://localhost:8080/rest/boards/1
	
	// @PostMapping("/boards") -> ui에서
	
	// @PutMapping("/boards/{bno}") -> ui에서
	//		1. findById
	//		2. title이나 content 수정하여 DB에 저장
	
	// @DeleteMapping("/boards/{bno}") -> ui에서
	
	

}
