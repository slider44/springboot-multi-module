package org.hotelooka.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.hotelooka.domain.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
