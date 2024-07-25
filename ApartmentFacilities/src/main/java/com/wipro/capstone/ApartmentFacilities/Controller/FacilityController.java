package com.wipro.capstone.ApartmentFacilities.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.capstone.ApartmentFacilities.Entity.Facility;
import com.wipro.capstone.ApartmentFacilities.Service.FacilityService;

@RestController
@RequestMapping("/api/facilities")

public class FacilityController {
	 @Autowired
	    private FacilityService facilityService;

	    @GetMapping("/{id}")
	    public ResponseEntity<Optional<Facility>> getFacilityById(@PathVariable Integer id) {
	        Optional<Facility> facility = facilityService.getFacilityById(id);
	        return ResponseEntity.ok(facility);
	    }

	    @GetMapping
	    public List<Facility> getAllFacilities() {
	        return facilityService.getAllFacilities();
	    }

	    @PostMapping
	    public Facility createFacility(@RequestBody Facility facility) {
	        return facilityService.createFacility(facility);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Facility> updateFacility(@PathVariable Integer id, @RequestBody Facility facilityDetails) {
	        Facility updatedFacility = facilityService.updateFacility(id, facilityDetails);
	        return ResponseEntity.ok(updatedFacility);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteFacility(@PathVariable Integer id) {
	        facilityService.deleteFacility(id);
	        return ResponseEntity.noContent().build();
	    }
}
