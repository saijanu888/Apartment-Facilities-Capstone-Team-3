package com.wipro.capstone.ApartmentFacilities.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.capstone.ApartmentFacilities.Entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
