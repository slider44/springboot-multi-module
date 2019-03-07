package org.hotelooka.persistence;

import org.hotelooka.domain.HotelBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelBookingRepository extends JpaRepository<HotelBooking, Long> {

}
