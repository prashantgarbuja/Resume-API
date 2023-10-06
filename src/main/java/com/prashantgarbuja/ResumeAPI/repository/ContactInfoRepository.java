package com.prashantgarbuja.ResumeAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashantgarbuja.ResumeAPI.model.ContactInfo;

public interface ContactInfoRepository extends JpaRepository<ContactInfo, Long> {

}
