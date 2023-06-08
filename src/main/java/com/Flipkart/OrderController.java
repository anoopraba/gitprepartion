package com.Flipkart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired
	OrderService ordSer;
	
	@PostMapping(value="/addval")
	public String addval(@RequestBody Order o) {
		return ordSer.addval(o);
	}
	
	@PostMapping(value="/addallval")
	public String addAllVal(@RequestBody List<Order> o) {
		return ordSer.addAllVal(o);
	}
	
	@GetMapping(value="/getorder")
	public List<Object> getOrderCity(){
		return ordSer.getOrderCity();
	}

}
