package com.wipro.capstone.ApartmentFacilities.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.capstone.ApartmentFacilities.Entity.Manager;
import com.wipro.capstone.ApartmentFacilities.Repository.ManagerRepository;

@Service

public class ManagerService {
	  @Autowired
	    private ManagerRepository managerRepository;

	    // Get all managers
	    public List<Manager> getAllManagers() {
	        return managerRepository.findAll();
	    }

	    // Get manager by ID
	    public Optional<Manager> getManagerById(Integer id) {
	        return managerRepository.findById(id);
	    }

	    // Create new manager
	    public Manager createManager(Manager manager) {
	        return managerRepository.save(manager);
	    }

	    // Update existing manager
	    public Manager updateManager(Integer id, Manager managerDetails) {
	        if (managerRepository.existsById(id)) {
	            managerDetails.setId(id);
	            return managerRepository.save(managerDetails);
	        }
	        return null; // or throw an exception
	    }

	    // Delete manager by ID
	    public void deleteManager(Integer id) {
	        if (managerRepository.existsById(id)) {
	            managerRepository.deleteById(id);
	        }
	    }
	}
