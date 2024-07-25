package com.wipro.capstone.ApartmentFacilities.Entity;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "booking")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Booking {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    @Column(name = "booking_date", nullable = false)
	    private Date bookingDate;

	    @Column(name = "facility_id", nullable = false)
	    private Integer facilityId;

	    @Column(name = "resident_id", nullable = false)
	    private Integer residentId;

	    @Column(name = "event_date", nullable = false)
	    private Date eventDate;	

	    @Column(name = "status", nullable = false)
	    private String status;

	   

}
