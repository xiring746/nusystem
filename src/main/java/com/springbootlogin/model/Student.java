package com.springbootlogin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
        @Column(name="first_name", nullable=false)
	    private String firstName;
        @Column(name="last_name")
	    private String LastName;
        @Column(name="address")
	    private String address;
        @Column(name="postalcode")
        private Long postalcode;
        @Column (name="profession")
        private String profession;
        @Column (name="department")
        private String department;
		
		
		public Student(String firstName, String lastName, String address, Long postalcode, String profession,
				String department) {
			super();
			this.firstName = firstName;
			LastName = lastName;
			this.address = address;
			this.postalcode = postalcode;
			this.profession = profession;
			this.department = department;
		}
		public Student() {
	    	
	    }
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Long getPostalcode() {
			return postalcode;
		}
		public void setPostalcode(Long postalcode) {
			this.postalcode = postalcode;
		}
		public String getProfession() {
			return profession;
		}
		public void setProfession(String profession) {
			this.profession = profession;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
	    
		
		
	    
}
