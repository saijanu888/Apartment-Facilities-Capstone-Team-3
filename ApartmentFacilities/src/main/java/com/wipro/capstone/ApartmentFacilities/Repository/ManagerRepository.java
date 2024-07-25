package com.wipro.capstone.ApartmentFacilities.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.capstone.ApartmentFacilities.Entity.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer> {
}
