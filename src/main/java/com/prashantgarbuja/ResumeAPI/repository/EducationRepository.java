package com.prashantgarbuja.ResumeAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashantgarbuja.ResumeAPI.model.Education;

public interface EducationRepository extends JpaRepository<Education, Long> {

}
