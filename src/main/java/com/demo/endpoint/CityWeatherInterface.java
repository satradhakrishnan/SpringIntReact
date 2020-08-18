package com.demo.endpoint;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.demo.model.CityMdl;

public interface CityWeatherInterface {
	
	
	@PostMapping("/city/weather")
	public String saveCityWeather(@RequestBody CityMdl cityMdl)	;
	
	@GetMapping("/city/weather/{id}")
	public CityMdl getCityWeather(@PathVariable int id)	;
	
	
	
	@GetMapping("/city/weathers/all")
	public List<CityMdl> getCityWeathers()	;
	

	
}
