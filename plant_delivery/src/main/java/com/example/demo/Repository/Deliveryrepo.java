package com.example.demo.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Deliverydetails;

@Repository
public interface Deliveryrepo extends JpaRepository<Deliverydetails,Integer> {
	//delete
		@Modifying
		@Query("delete from Deliverydetails s where s.customername=?1")
		public int deleteDeliverydetailsByCustomername(String customername);
		
	//update
		@Modifying
		@Query("update Deliverydetails s set s.planttype=?1 where s.customername=?2 ")
		public int updateDeliverydetails(String planttype,String customername);
		
		
}
	