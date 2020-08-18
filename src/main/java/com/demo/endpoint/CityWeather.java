package com.demo.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.CityMdl;

@RestController
public class CityWeather implements CityWeatherInterface {
	
	@Override
	public String saveCityWeather(@RequestBody CityMdl cityMdl) {
		
		
		return "Success";
		
	}

	@Override
	public CityMdl getCityWeather(int id) {
		
		CityMdl cityMdl = new CityMdl();
		cityMdl.setClub(id);
		cityMdl.setLatitude(new Double("100"));
		cityMdl.setLocation("Chennai");
		cityMdl.setLogitude(new Double("101.8"));
		
		return cityMdl;
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@Override
	public List<CityMdl> getCityWeathers() {
		
		List<CityMdl> cityMdls = new ArrayList<>();

		CityMdl cityMdl = new CityMdl();
		cityMdl.setClub(1);
		cityMdl.setLatitude(new Double("100"));
		cityMdl.setLocation("Chennai");
		cityMdl.setLogitude(new Double("101.8"));
		
		CityMdl cityMdl2 = new CityMdl();
		cityMdl2.setClub(2);
		cityMdl2.setLatitude(new Double("100"));
		cityMdl2.setLocation("Chennai");
		cityMdl2.setLogitude(new Double("101.8"));
		
		cityMdls.add(cityMdl);
		cityMdls.add(cityMdl2);
		// TODO Auto-generated method stub
		return cityMdls;
	}

}
