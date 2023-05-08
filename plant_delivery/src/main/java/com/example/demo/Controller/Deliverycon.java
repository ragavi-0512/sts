package com.example.demo.Controller;

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

import com.example.demo.Model.Deliverydetails;
import com.example.demo.Service.Deliveryser;


@RestController
@RequestMapping("/cust")
public class Deliverycon {
	@Autowired
	Deliveryser rag;

	@PostMapping("")
	public String addDetails(@RequestBody Deliverydetails abc)
	{
		return rag.addCustomer(abc);
	}
	@GetMapping("")
	public List<Deliverydetails>read()
	{
		return rag.getCustomer();
	}
	@GetMapping("/{id}")
	public Optional<Deliverydetails>readByID(@PathVariable int id)
	{
		return rag.getCustomerById(id);
	}
	@PutMapping("/{id}")
	public String update(@RequestBody Deliverydetails abc )
	{
		return rag.getSave(abc);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam ("cid") int id)
	{
		rag.deleteByRequestParam(id);
	    return"delete";
}
	@GetMapping("/sort/{customername}")
	 public List<Deliverydetails> sortCar(@PathVariable("customername") String customername)
	 {
	  
	  return rag.sortDecs(customername);
	 }
	 @GetMapping("/pagination/{cnu}/{csize}")
	 public List<Deliverydetails> paginationData(@PathVariable("cnu") int cnu,@PathVariable("csize") int csize)
	 {
	  return rag.paginationData(cnu,csize);
	 }
	 @GetMapping("/pageAndsort/{cnu}/{csize}/{customername}")
	 public List<Deliverydetails> paginationSorting(@PathVariable("cnu") int cnu,@PathVariable("csize") int csize,@PathVariable("cname") String customername)
	 {
	  return rag.paginationAndSorting(cnu, csize, customername);
	 }
	 //delete queries
	//delete query
	

	 @DeleteMapping("/deletemapping1/{customername}")
	 public String deleteDeliverydetailsByName(@PathVariable("customername") String customername)
	 {
	 	 int result=rag.deleteDeliverydetailsByCustomername(customername);
	 	 if(result>0)
	 		 return "Customer record is deleted";
	 	 else
	 		 return"No record found";
	 }

	 //update query
	 


	 @PutMapping("/updatebyquery/{planttype}/{customername}")
	 public String updateDeliverydetails(@PathVariable ("planttype")String planttype,@PathVariable ("customername") String customername)
	 {
	 	int res=rag.updateDeliverydetails(planttype, customername);
	 	if(res>0)
	 		return "Customer record updated";
	 	else
	 		return "Problem occured while updating";
	 }

}
	


	 
	 

