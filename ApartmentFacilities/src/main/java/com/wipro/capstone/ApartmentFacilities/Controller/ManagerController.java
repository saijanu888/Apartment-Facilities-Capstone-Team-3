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

import com.wipro.capstone.ApartmentFacilities.Entity.Manager;
import com.wipro.capstone.ApartmentFacilities.Service.ManagerService;

@RestController
@RequestMapping("/api/managers")

public class ManagerController {
	 @Autowired
	    private ManagerService managerService;

	    @GetMapping("/{id}")
	    public ResponseEntity<Optional<Manager>> getManagerById(@PathVariable Integer id) {
	        Optional<Manager> manager = managerService.getManagerById(id);
	        return ResponseEntity.ok(manager);
	    }

	    @GetMapping
	    public List<Manager> getAllManagers() {
	        return managerService.getAllManagers();
	    }

	    @PostMapping
	    public Manager createManager(@RequestBody Manager manager) {
	        return managerService.createManager(manager);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Manager> updateManager(@PathVariable Integer id, @RequestBody Manager managerDetails) {
	        Manager updatedManager = managerService.updateManager(id, managerDetails);
	        return ResponseEntity.ok(updatedManager);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteManager(@PathVariable Integer id) {
	        managerService.deleteManager(id);
	        return ResponseEntity.noContent().build();
	    }

}
