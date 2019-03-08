package org.hotelooka.web;

import java.util.List;

import org.hotelooka.domain.HotelBooking;
import org.hotelooka.service.booking.HotelBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	HotelBookingService hotelBookingService;
	
	@GetMapping("/all")
	public List<HotelBooking> getAllBookings() {
		
		return hotelBookingService.getAllBooking();
	}
}
