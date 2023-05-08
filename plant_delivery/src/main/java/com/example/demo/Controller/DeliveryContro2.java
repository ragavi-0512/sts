package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Deliverydet2;
import com.example.demo.Service.Deliveryservice;
@RestController
@RequestMapping("/user")
public class DeliveryContro2 {
@Autowired
private Deliveryservice lser;
@PostMapping("/log")
public String login(@RequestBody Map<String,String>loginData)
{
	String username=loginData.get("username");
	String password=loginData.get("password");
	String result=lser.checkLogin(username,password);
	return result;
}
@PostMapping("/put")
public Deliverydet2 putUser(@RequestBody Deliverydet2 cl)
{
	return lser.putUser(cl);
}
@PostMapping("/adduser")
public  Deliverydet2 AddUser(@RequestBody Deliverydet2 cl )
{
	return lser.addUser(cl);
}
@GetMapping ("/sh")
public List< Deliverydet2>listAll()
{
	return lser.getUser();
}
}
