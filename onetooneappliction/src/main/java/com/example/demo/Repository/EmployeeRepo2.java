package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.MODEL.Address;

@Repository

	public interface EmployeeRepo2 extends JpaRepository<Address, Integer>{

	}

