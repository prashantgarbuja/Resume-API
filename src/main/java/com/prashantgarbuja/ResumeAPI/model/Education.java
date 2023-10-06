package com.prashantgarbuja.ResumeAPI.model;

import java.util.UUID;

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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "education")
public class Education {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID _id;
	
	@Column(nullable = false)
	private String qualification;
	
	private String year;
	
	private String institute;
	
	private String major;

	private String[] achievements;

}
