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
@Table(name = "projects")
public class Projects {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID _id;
	
	@Column(nullable = false)
	private String title;
	
	private String repo;
	
	private String description;
	
	@Column(name = "tech_stack")
	private String[] techStack;	

}
