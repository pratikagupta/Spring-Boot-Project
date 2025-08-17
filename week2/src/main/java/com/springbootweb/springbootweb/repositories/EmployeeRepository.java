package com.springbootweb.springbootweb.repositories;

import com.springbootweb.springbootweb.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <EmployeeEntity, Long> {
}
