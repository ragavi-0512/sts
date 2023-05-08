package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Deliverydet2;

public interface Deliveryrep2 extends JpaRepository< Deliverydet2 ,String>{

	Deliverydet2 findByUname(String username);
	
	
}


