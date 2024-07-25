package com.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.entity.Apartment;

public interface ApartmentRepository extends JpaRepository<Apartment, Long> {

}
