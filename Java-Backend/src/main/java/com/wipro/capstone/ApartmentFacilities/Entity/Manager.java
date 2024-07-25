package com.wipro.capstone.ApartmentFacilities.Entity;
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
@Table(name = "manager")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Manager {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    @Column(name = "name", nullable = false)
	    private String name;

	    @Column(name = "phone", nullable = false, unique = true)
	    private String phone;

	    @Column(name = "email", nullable = false, unique = true)
	    private String email;

		public void setId(Integer id2) {
			// TODO Auto-generated method stub
			
		}

	    // Getters and Setters
}
