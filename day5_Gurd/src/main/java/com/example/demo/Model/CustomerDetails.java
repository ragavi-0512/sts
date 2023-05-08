package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CustomerDetails {
	@Id
private int Customerid;
private String Customername;
private Long Customerphoneno;
private String Planttype;
private String Plantname;
private String CustomerOccasion;
public int getCustomerid() {
	return Customerid;
}
public void setCustomerid(int customerid) {
	Customerid = customerid;
}
public String getCustomername() {
	return Customername;
}
public void setCustomername(String customername) {
	Customername = customername;
}
public Long getCustomerphoneno() {
	return Customerphoneno;
}
public void setCustomerphoneno(Long customerphoneno) {
	Customerphoneno = customerphoneno;
}
public String getPlanttype() {
	return Planttype;
}
public void setPlanttype(String planttype) {
	Planttype = planttype;
}
public String getPlantname() {
	return Plantname;
}
public void setPlantname(String plantname) {
	Plantname = plantname;
}
public String getCustomerOccasion() {
	return CustomerOccasion;
}
public void setCustomerOccasion(String customerOccasion) {
	CustomerOccasion = customerOccasion;
}
@Override
public String toString() {
	return "CustomerDetails [Customerid=" + Customerid + ", Customername=" + Customername + ", Customerphoneno="
			+ Customerphoneno + ", Planttype=" + Planttype + ", Plantname=" + Plantname + ", CustomerOccasion="
			+ CustomerOccasion + "]";
}
}





