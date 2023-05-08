package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Deliverydetails;
import com.example.demo.Repository.Deliveryrepo;

import jakarta.transaction.Transactional;


@Service
public class Deliveryser {
	@Autowired
	Deliveryrepo repository;

	public String addCustomer(Deliverydetails rag)
	{
		repository.save(rag);
		return "Thanks";
	}
	public List<Deliverydetails>getCustomer()
	{
		return repository.findAll();
	}
	public Optional<Deliverydetails>getCustomerById(int id)
	{
		return repository.findById(id);
	}
	public String getSave(Deliverydetails rag)
	{
		repository.save(rag);
		return "Updated";
	}
	public void deleteByRequestParam(int id)
	{
		repository.deleteById(id);
	}
	//sort
	public List<Deliverydetails>sortDecs(String customername)
	{
		return repository.findAll(Sort.by(customername).descending());
	}
	//pagination
	
	public List<Deliverydetails>paginationData(int cnu,int csize)
	{
		Page<Deliverydetails>p=repository.findAll(PageRequest.of(cnu, csize));
		return p.getContent();
	}
	public List<Deliverydetails> paginationAndSorting(int cnu,int csize,String customername)
	{
		Page<Deliverydetails>p=repository.findAll(PageRequest.of(cnu, csize,Sort.by(customername).descending()));
		return p.getContent();
	}
	//delete query
	@Transactional
	public int deleteDeliverydetailsByCustomername(String customername)
	{
		return repository.deleteDeliverydetailsByCustomername(customername);
	}

	//update query
	@Transactional
	public int updateDeliverydetails(String planttype,String customername)
	{
		return repository.updateDeliverydetails(planttype, customername);
	}
	
	
	}

	
