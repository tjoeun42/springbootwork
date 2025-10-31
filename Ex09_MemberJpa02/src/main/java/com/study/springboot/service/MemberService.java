package com.study.springboot.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.domain.Member;
import com.study.springboot.repository.MemberRepository;

import com.study.springboot.domain.Member;

@Service
public class MemberService {
	@Autowired
	MemberRepository mRepository;
	
	public void insert() {
		Member user;
		user = new Member("test1@tjoeun.com", "김민수");
		mRepository.save(user);
		user = new Member("test2@tjoeun.com", "이서연");
		mRepository.save(user);
		user = new Member("test3@tjoeun.com", "박지훈");
		mRepository.save(user);
		user = new Member("test4@tjoeun.com", "최유진");
		mRepository.save(user);
		user = new Member("test5@tjoeun.com", "정현우");
		mRepository.save(user);
		user = new Member("test6@tjoeun.com", "한지민");
		mRepository.save(user);
		user = new Member("test7@tjoeun.com", "오세훈");
		mRepository.save(user);
		user = new Member("test8@tjoeun.com", "윤아름");
		mRepository.save(user);
		user = new Member("test9@tjoeun.com", "장민재");
		mRepository.save(user);
	}

	public List<Member> selectAll() {
		return mRepository.findAll();
	}

	public Optional<Member> selectById(Long id) {
		return mRepository.findById(id);
	}

	public List<Member> selectByName(String name) {
		return mRepository.findByName(name);
	}
}