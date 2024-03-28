package com.travel.Agency.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.Agency.Entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer>{

}
