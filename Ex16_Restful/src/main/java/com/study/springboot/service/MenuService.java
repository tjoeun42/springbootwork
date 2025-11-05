package com.study.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.domain.Menu;
import com.study.springboot.domain.Type;
import com.study.springboot.repository.MenuRepository;

@Service
public class MenuService {
	
	@Autowired
	MenuRepository mRepository;

	public List<Menu> menuAllList() {
		return mRepository.findAll();
	}

	public List<Menu> findByType(Type type) {
		return mRepository.findByType(type);
	}

}
