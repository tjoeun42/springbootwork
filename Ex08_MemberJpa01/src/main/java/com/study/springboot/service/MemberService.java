package com.study.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.domain.Member;
import com.study.springboot.repository.MemberRepository;

@Service
public class MemberService {
	@Autowired
	MemberRepository mRepository;
	
	public Member insert(Member member) {
		/*
		 * save() : insert할 때의 메소드
		            동일한 키가 없으면 insert, 동일한 키가 있으면 update 
		 */
		Member rMember = mRepository.save(member);
		return rMember;
	}

}
