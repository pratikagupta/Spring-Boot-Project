package com.springbootweb.project.hospitalManagementSystem.repository;

import com.springbootweb.project.hospitalManagementSystem.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
