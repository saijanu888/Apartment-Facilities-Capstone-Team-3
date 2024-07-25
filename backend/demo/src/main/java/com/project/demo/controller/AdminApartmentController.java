package com.project.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.entity.Apartment;
import com.project.demo.service.ApartmentService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/admin/apartments")
public class AdminApartmentController {
	@Autowired
    private ApartmentService apartmentService;

    @GetMapping
    public List<Apartment> getAllApartments() {
        return apartmentService.getAllApartments();
    }

    @GetMapping("/{id}")
    public Apartment getApartmentById(@PathVariable Long id) {
        return apartmentService.getApartmentById(id);
    }

    @PostMapping
    public Apartment createApartment(@Valid @RequestBody Apartment apartment) {
        return apartmentService.saveApartment(apartment);
    }

    @PutMapping("/{id}")
    public Apartment updateApartment(@PathVariable Long id, @Valid @RequestBody Apartment apartment) {
        Apartment existingApartment = apartmentService.getApartmentById(id);
        if (existingApartment != null) {
            apartment.setId(id);
            return apartmentService.saveApartment(apartment);
        } else {
            return null; // handle not found case
        }
    }

    @DeleteMapping("/{id}")
    public void deleteApartment(@PathVariable Long id) {
        apartmentService.deleteApartment(id);
    }

}
