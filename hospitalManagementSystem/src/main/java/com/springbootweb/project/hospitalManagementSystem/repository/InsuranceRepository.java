package com.springbootweb.project.hospitalManagementSystem.repository;

import com.springbootweb.project.hospitalManagementSystem.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}
