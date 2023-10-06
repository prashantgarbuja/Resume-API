package com.prashantgarbuja.ResumeAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashantgarbuja.ResumeAPI.model.Projects;

public interface ProjectsRepository extends JpaRepository<Projects, Long>{

}
