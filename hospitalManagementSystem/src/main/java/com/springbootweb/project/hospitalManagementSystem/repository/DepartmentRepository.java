package com.springbootweb.project.hospitalManagementSystem.repository;

import com.springbootweb.project.hospitalManagementSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
