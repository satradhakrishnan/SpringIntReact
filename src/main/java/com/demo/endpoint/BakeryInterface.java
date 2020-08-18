package com.demo.endpoint;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.model.Cake;

public interface BakeryInterface {
	
	
	@PostMapping("/bakery/cake/order")
	public String saveCakeOrder(@RequestBody Cake cake)	;
	
	
}
