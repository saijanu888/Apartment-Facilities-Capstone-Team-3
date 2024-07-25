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
@Table(name = "resident")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Resident {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    @Column(name = "name", nullable = false)
	    private String name;

	    @Column(name = "flat_no", nullable = false)
	    private String flatNo;

	    @Column(name = "flat_type", nullable = false)
	    private String flatType;

	    @Column(name = "phone", nullable = false, unique = true)
	    private String phone;

	    @Column(name = "email", nullable = false, unique = true)
	    private String email;

	    @Column(name = "picture")
	    private String picture;

		public void setId(Integer id2) {
			// TODO Auto-generated method stub
			
		}

}
