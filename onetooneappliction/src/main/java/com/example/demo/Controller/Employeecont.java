package com.example.demo.Controller;


	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	//import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.example.demo.MODEL.Details;
import com.example.demo.Service.EmployeeSer;


	@RestController


	public class Employeecont {

		@Autowired
		
		EmployeeSer sobj;
		@PostMapping("/postdetails")
		public Details add(@RequestBody Details sobj1 )
		{
			return sobj.addPerson(sobj1);
		}
		@GetMapping("/getdetails")
		public List <Details> get()
		{
			return sobj.getPerson();
		}
			
		

}
