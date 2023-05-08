package com.example.demo.MODEL;


	import jakarta.persistence.CascadeType;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.Id;
	import jakarta.persistence.JoinColumn;
	import jakarta.persistence.OneToOne;

	@Entity
	public class Details {
		@Id
		@GeneratedValue 
		private int id;
		
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getPass() {
			return pass;
		}


		public void setPass(String pass) {
			this.pass = pass;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		@Override
		public String toString() {
			return "Details [id=" + id + ", name=" + name + ", pass=" + pass + ", email=" + email + ", address="+ address +"]";
		}


		private String name;
		private String pass;
		private String email;
		
		
		public Details() {
			super();
			// TODO Auto-generated constructor stub
		}
		@OneToOne(cascade  = CascadeType.ALL)
		@JoinColumn(name="")
		private Address address;

		public Address getAddress() {
			return address;
		}


		public void setAddress(Address address) {
			this.address = address;
		}
		
		
}
