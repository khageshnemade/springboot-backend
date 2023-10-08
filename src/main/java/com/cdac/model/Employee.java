package com.cdac.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter@Setter@Entity
public class Employee {
	@Id@GeneratedValue long id;
			private String firstName;
			private String lastName;
			private String emailId;
			public Employee(String firstName, String lastName, String emailId) {
				super();
				this.firstName = firstName;
				this.lastName = lastName;
				this.emailId = emailId;
			}
		
}
