package com.springbootweb.project.hospitalManagementSystem.repository;

import com.springbootweb.project.hospitalManagementSystem.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
