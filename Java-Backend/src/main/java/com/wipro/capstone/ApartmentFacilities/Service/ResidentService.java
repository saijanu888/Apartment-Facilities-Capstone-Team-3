package com.wipro.capstone.ApartmentFacilities.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.capstone.ApartmentFacilities.Entity.Resident;
import com.wipro.capstone.ApartmentFacilities.Repository.ResidentRepository;

@Service

public class ResidentService {
	 @Autowired
	    private ResidentRepository residentRepository;
	 
	    // Get all residents
	    public List<Resident> getAllResidents() {
	        return residentRepository.findAll();
	    }

	    // Get resident by ID
	    public Optional<Resident> getResidentById(Integer id) {
	        return residentRepository.findById(id);
	    }

	    // Create new resident
	    public Resident createResident(Resident resident) {
	        return residentRepository.save(resident);
	    }

	    // Update existing resident
	    public Resident updateResident(Integer id, Resident residentDetails) {
	        if (residentRepository.existsById(id)) {
	            residentDetails.setId(id);
	            return residentRepository.save(residentDetails);
	        }
	        return null; // or throw an exception
	    }

	    // Delete resident by ID
	    public void deleteResident(Integer id) {
	        if (residentRepository.existsById(id)) {
	            residentRepository.deleteById(id);
	        }
	    }
	}
