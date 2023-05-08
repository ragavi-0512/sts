package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Deliverydetails {
	@Id
	private int Customerid;
	private String customername;
	private Long Customerphoneno;
	private String planttype;
	private String Plantname;
	private String CustomerOccasion;
	public int getCustomerid() {
		return Customerid;
	}
	public void setCustomerid(int customerid) {
		Customerid = customerid;
	}
	
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public Long getCustomerphoneno() {
		return Customerphoneno;
	}
	public void setCustomerphoneno(Long customerphoneno) {
		Customerphoneno = customerphoneno;
	}
	public String getPlanttype() {
		return planttype;
	}
	public void setPlanttype(String planttype) {
		this.planttype = planttype;
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
		return "Deliverydetails [Customerid=" + Customerid + ", Customername=" + customername + ", Customerphoneno="
				+ Customerphoneno + ", Planttype=" + planttype + ", Plantname=" + Plantname + ", CustomerOccasion="
				+ CustomerOccasion + "]";
	}
}
