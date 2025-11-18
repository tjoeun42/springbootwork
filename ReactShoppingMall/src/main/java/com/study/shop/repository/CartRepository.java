package com.study.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.shop.domain.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

}
