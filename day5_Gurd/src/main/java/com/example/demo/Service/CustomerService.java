 package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.CustomerDetails;
import com.example.demo.Repository.CustomerRep;

@Service
public class CustomerService {
@Autowired
CustomerRep repository;
public String addCustomer(CustomerDetails rag)
{
	repository.save(rag);
	return "Thanks";
}
public List<CustomerDetails>getCustomer()
{
	return repository.findAll();
}
public Optional<CustomerDetails> getCustomerById(int id)
{
	return repository.findById(id);
}
public String updateCustomer(CustomerDetails rag)
{
	repository.save(rag);
	return"Updated";
}
public void deleteByRequestParam(int id)
{
	repository.deleteById(id);
}
public CustomerDetails saveInfo(CustomerDetails rag) {
	// TODO Auto-generated method stub
	return null;
}
public CustomerDetails updateInfo(CustomerDetails rag) {
	// TODO Auto-generated method stub
	return null;
}
public void deleteInfo(int rag) {
	// TODO Auto-generated method stub
	
}
public List<CustomerDetails> sortDesc(String rag) {
	// TODO Auto-generated method stub
	return null;
}
public List<CustomerDetails> sortAsc(String rag) {
	// TODO Auto-generated method stub
	return null;
}
public List<CustomerDetails> paginationData(int pnu, int psize) {
	// TODO Auto-generated method stub
	return null;
}
}
