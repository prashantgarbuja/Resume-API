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
@Table(name = "about_me")
public class AboutMe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID _id;
	
	@Column(nullable = false)
	private String name;
    
	private String title;	
    
	private String summary;
	
	private String address;		
}
