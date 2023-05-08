package com.example.demo.MODEL;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;

	@Entity

	public class Address {
		public Address() {
			super();
		}
		
		@Override
		public String toString() {
			return "Address [id=" + id + ", street=" + street + ", city=" + city + ", zipcode=" + zipcode + "]";
		}
		
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		 private long id;
		private String street;
		private String city;
		private String zipcode;
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
}
