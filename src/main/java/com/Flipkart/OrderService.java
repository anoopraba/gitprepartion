package com.Flipkart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	OrderDao ordDao;

	public String addval(Order o) {
		return ordDao.addval(o);
	}

	public String addAllVal(List<Order> o) {
		return ordDao.addAllVal(o);
	}

	public List<Object> getOrderCity() {
		return ordDao.getOrderCity();
	}

}
