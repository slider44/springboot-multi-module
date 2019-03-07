package org.hotelooka.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="hotel_booking")
public class HotelBooking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long booking_id;
	
	@Column(name="price_per_night")
	private double pricePerNight;
	
	@Column(name="nb_Of_Nights")
	private int nbOfNights;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "hotel_id")
	private Hotel hotel;

	public HotelBooking() {
		
	}
	
	public HotelBooking(double pricePerNight, int nbOfNights) {
		this.pricePerNight = pricePerNight;
		this.nbOfNights = nbOfNights;
 	}

	
	public long getBooking_id() {
		return booking_id;
	}


	public void setBooking_id(long booking_id) {
		this.booking_id = booking_id;
	}

	public double getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public int getNbOfNights() {
		return nbOfNights;
	}

	public void setNbOfNights(int nbOfNights) {
		this.nbOfNights = nbOfNights;
	}
	
	public Hotel getHotel () {
		return hotel;
	}
	
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

}
