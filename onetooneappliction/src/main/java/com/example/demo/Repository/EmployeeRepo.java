package com.example.demo.Repository;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	
import com.example.demo.MODEL.Details;

	@Repository

	public interface EmployeeRepo extends JpaRepository<Details, Long > {

	}

