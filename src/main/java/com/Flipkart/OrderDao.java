package com.Flipkart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {
	@Autowired
	OrderRepository ordRepo;

	public String addval(Order o) {
		ordRepo.save(o);
		return "saved successfully";
	}

	public String addAllVal(List<Order> o) {
		ordRepo.saveAll(o);
		return "saved";
	}

	public List<Object> getOrderCity() {
		return ordRepo.getOrderCity();
	}
	

}
