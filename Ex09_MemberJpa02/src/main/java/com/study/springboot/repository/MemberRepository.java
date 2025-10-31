package com.study.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.springboot.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
	//findBy 뒤에 컬럼명을 붙여주면 이를 이용한 검색 가능
	List<Member> findByName(String name);

}
