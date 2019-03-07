package org.hotelooka.web;


import java.util.List;

import org.hotelooka.domain.Hotel;
import org.hotelooka.service.HotelServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {
	
	@Autowired
	HotelServiceImp hotelService;

	
	@GetMapping("/hotels")
	public List<Hotel> getAllHotels() {
		
		return hotelService.getAllHotels();
	}
	
	
	
	
}
