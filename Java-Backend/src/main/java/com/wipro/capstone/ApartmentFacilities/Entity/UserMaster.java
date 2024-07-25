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
@Table(name = "user_master")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class UserMaster {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "status", nullable = false)
    private String status;

	public Object getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setUsername(Object username2) {
		// TODO Auto-generated method stub
		
	}

	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPassword(Object password2) {
		// TODO Auto-generated method stub
		
	}

	public Object getRole() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setRole(Object role2) {
		// TODO Auto-generated method stub
		
	}

	public Object getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setStatus(Object status2) {
		// TODO Auto-generated method stub
		
	}

    // Getters and Setters
}


