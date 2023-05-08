package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Deliverydet2;
import com.example.demo.Repository.Deliveryrep2;

@Service
public class Deliveryservice {
@Autowired
private  Deliveryrep2 lrepo;
public String checkLogin(String uname,String pwd)
{
	 Deliverydet2 user=lrepo.findByUname(uname);
	 if(user==null)
	 {
		 return "No user found";
	 }
	 else
	 {
		 if(user.getPwd().equals(pwd))
		 {
			 return "Login Succesfull";
		 }
		 else
		 {
			 return "Login Failed";
		 }
	 }
	 
	 }
	 public Deliverydet2 addUser( Deliverydet2 cl)
	 {
		 return lrepo.save(cl);
	 }
	 public List< Deliverydet2>getUser()
	 {
		 return lrepo.findAll();
	 }
	 public  Deliverydet2 putUser( Deliverydet2 cl)
	 {
		 return lrepo.save(cl);
	 }

}
