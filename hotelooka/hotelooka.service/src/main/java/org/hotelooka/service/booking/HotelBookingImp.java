package org.hotelooka.service.booking;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hotelooka.domain.Hotel;
import org.hotelooka.domain.HotelBooking;
import org.hotelooka.persistence.HotelBookingRepository;
import org.hotelooka.persistence.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HotelBookingImp implements HotelBookingService {

	@Autowired
	HotelBookingRepository hotelBookingRepository;
	
	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	HotelRepository hotelRepository;

	@Override
	public HotelBooking createBooking(HotelBooking hotelBooking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HotelBooking getBooking(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> deleteBooking(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HotelBooking> getAllBooking() {
		
		return hotelBookingRepository.findAll();
		
	}
	
	

}
