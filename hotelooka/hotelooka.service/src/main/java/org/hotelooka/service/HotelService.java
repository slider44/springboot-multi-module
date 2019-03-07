package org.hotelooka.service;

import java.util.List;

import org.hotelooka.domain.Hotel;
import org.springframework.http.ResponseEntity;


public interface HotelService {
	
	Hotel createHotel (Hotel hotel);
	
	Hotel getHotel(Long id);

	Hotel editHotel(Hotel hotel);
	
	void deleteHotel(Hotel hotel);

	ResponseEntity<?> deleteHotel(Long id);

	List<Hotel> getAllHotels(int pageNumber, int pageSize);

	List<Hotel> getAllHotels();

	long countCustomer();
}
