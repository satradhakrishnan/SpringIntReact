package com.demo.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Cake;
import com.demo.service.CakeRepository;

@RestController
public class BakeryCon implements BakeryInterface {
	
	@Autowired
	CakeRepository cakeRepository;

	@Override
	public String saveCakeOrder(Cake cake) {
		cakeRepository.save(cake);
		// TODO Auto-generated method stub
		return cake.getOrderid().toString();
	}
	
	


}
