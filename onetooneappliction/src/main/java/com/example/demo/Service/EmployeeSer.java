package com.example.demo.Service;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	
import com.example.demo.MODEL.Details;
import com.example.demo.Repository.EmployeeRepo;

	@Service

	public class EmployeeSer {

		@Autowired
		EmployeeRepo robj;
		public Details addPerson(Details sobj1) {
			
			return  robj.save(sobj1);
		}

		public List<Details> getPerson() {
			return robj.findAll();
		}
	}

