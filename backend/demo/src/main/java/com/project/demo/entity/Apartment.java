package com.project.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Apartment {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String number;

    @NotNull
    private int floor;

    @NotNull
    private double rent;
    
    Apartment(){}
    
    

	public Apartment(Long id, @NotNull String number, @NotNull int floor, @NotNull double rent) {
		super();
		this.id = id;
		this.number = number;
		this.floor = floor;
		this.rent = rent;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}



	@Override
	public String toString() {
		return "Apartment [id=" + id + ", number=" + number + ", floor=" + floor + ", rent=" + rent + "]";
	}
	
    
    
}
