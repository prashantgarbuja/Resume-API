package com.prashantgarbuja.ResumeAPI.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashantgarbuja.ResumeAPI.model.*;
import com.prashantgarbuja.ResumeAPI.repository.*;

@RestController
@RequestMapping("/api")
public class ResumeController {

	private final ContactInfoRepository contactInfoRepository;
	private final AboutMeRepository aboutMeRepository;
	private final ApiRouteRepository apiRouteRepository;
	private final ProjectsRepository projectsRepository;
	private final ExperienceRepository experienceRepository;
	private final EducationRepository educationRepository;

	public ResumeController(ContactInfoRepository contactInfoRepository, 
			AboutMeRepository aboutMeRepository, 
			ApiRouteRepository apiRouteRepository,
			ProjectsRepository projectsRepository,
			ExperienceRepository experienceRepository,
			EducationRepository educationRepository) {
		 this.contactInfoRepository = contactInfoRepository;
		 this.aboutMeRepository = aboutMeRepository;
		 this.apiRouteRepository = apiRouteRepository;
		 this.projectsRepository = projectsRepository;
		 this.experienceRepository = experienceRepository;
		 this.educationRepository = educationRepository;
	 }
	
	@GetMapping
	public List<ApiRoute> getAPI() {
		return apiRouteRepository.findAll();
	}
	
	@GetMapping(path = "/contact")
	public List<ContactInfo> getContactInfo() {
		return contactInfoRepository.findAll();	
		}

	@GetMapping(path = "/me")
	public List<AboutMe> getAboutMe() {
		return aboutMeRepository.findAll();	
		}
	
	@GetMapping(path = "/projects")
	public List<Projects> getProjects() {
		return projectsRepository.findAll();	
		}
	
	@GetMapping(path = "/experience")
	public List<Experience> getExperience() {
		return experienceRepository.findAll();	
		}
	
	@GetMapping(path = "/education")
	public List<Education> getEducation() {
		return educationRepository.findAll();	
		}
	
	@GetMapping("/resume")
	public Map<String, List<?>> getResume() {
		//Using LinkedHashMap instead of HashMap to maintain order.
	    Map<String, List<?>> resumeData = new LinkedHashMap<>();
	    
	    resumeData.put("About me", aboutMeRepository.findAll());
	    resumeData.put("Projects", projectsRepository.findAll());
	    resumeData.put("Education", educationRepository.findAll());
	    resumeData.put("Experience", experienceRepository.findAll());
	    resumeData.put("Contact info", contactInfoRepository.findAll());
	    return resumeData;
	}
}
