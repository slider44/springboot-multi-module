package org.hotelooka.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long hotel_id;
	
	@Column(name="hotel_name")
	private String hotel_name;
	
	private int classification;
	private Integer isOpen;
	
	@OneToMany(targetEntity=HotelBooking.class)
	@JoinColumn(name= "hotel_id")
	private List<HotelBooking> bookingList;
	
	protected Hotel() {
		
	}
	
	public Hotel(String name, int classification, Integer isOpen) {
		this.hotel_name = name;
		this.classification = classification;
		this.isOpen = isOpen;
		
	}
	
	public long getId() {
		return hotel_id;
	}

	public void setId(long id) {
		this.hotel_id = id;
	}

	public String getName() {
		return hotel_name;
	}

	public void setName(String name) {
		this.hotel_name = name;
	}

	public int getClassification() {
		return classification;
	}

	public void setClassification(int classification) {
		this.classification = classification;
	}

	public Integer isOpen() {
		return isOpen;
	}

	public void setOpen(Integer isOpen) {
		this.isOpen = isOpen;
	}
}
