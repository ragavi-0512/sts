package com.example.demo.Customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.CustomerDetails;
import com.example.demo.Service.CustomerService;

@RestController
@RequestMapping("/Customer")
public class Customer {
@Autowired
CustomerService ser;

@PostMapping("")
public CustomerDetails addDetails(@RequestBody CustomerDetails rag )
{
	return ser.saveInfo(rag);
}
@GetMapping("/abc")
public List<CustomerDetails>read()
{
	return ser.getCustomer();
}
@PutMapping("/id")
public CustomerDetails updateDetails (@RequestBody CustomerDetails rag)
{
	return ser.updateInfo(rag);
}
@DeleteMapping("/delete/{cid}")
public String deleteDetails(@PathVariable("cid")int rag)
{
	ser.deleteInfo(rag);
	return"Customerphoneno"+rag+" is deleted";
}
@DeleteMapping("/deleteReq")
public String deleteByReq(@RequestParam ("cid") int rag)
{
	ser.deleteInfo(rag);
	return "Customerphoneno"+rag+" is deleted";
}
@GetMapping("/sortDesc/(name)")
public List<CustomerDetails>sortOwner(@PathVariable("name")String rag)
{
	return ser.sortDesc(rag);
}
@GetMapping("/sortAsc/(name)")
public List<CustomerDetails>sortOwnerasc(@PathVariable ("name")String rag)
{
	return ser.sortAsc(rag);
}
@GetMapping("/pagination/{pnu}/{psize}")
public List<CustomerDetails>paginationData(@PathVariable ("pnu") int pnu, @PathVariable("psize")int psize)
{
	return ser.paginationData(pnu,psize);
}
}