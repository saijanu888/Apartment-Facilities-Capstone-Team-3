package com.wipro.capstone.ApartmentFacilities.Service;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.capstone.ApartmentFacilities.Entity.Facility;
import com.wipro.capstone.ApartmentFacilities.Repository.FacilityRepository;

@Service
public class FacilityService {
	@Autowired
    private FacilityRepository facilityRepository;

    // Get all facilities
    public List<Facility> getAllFacilities() {
        return facilityRepository.findAll();
    }

    // Get facility by ID
    public Optional<Facility> getFacilityById(Integer id) {
        return facilityRepository.findById(id);
    }

    // Create new facility
    public Facility createFacility(Facility facility) {
        return facilityRepository.save(facility);
    }

    // Update existing facility
    public Facility updateFacility(Integer id, Facility facilityDetails) {
        if (facilityRepository.existsById(id)) {
            facilityDetails.setId(id);
            return facilityRepository.save(facilityDetails);
        }
        return null; // or throw an exception
    }

    // Delete facility by ID
    public void deleteFacility(Integer id) {
        if (facilityRepository.existsById(id)) {
            facilityRepository.deleteById(id);
        }
    }
}
