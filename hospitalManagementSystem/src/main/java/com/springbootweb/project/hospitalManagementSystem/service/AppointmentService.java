package com.springbootweb.project.hospitalManagementSystem.service;

import com.springbootweb.project.hospitalManagementSystem.entity.Appointment;
import com.springbootweb.project.hospitalManagementSystem.entity.Doctor;
import com.springbootweb.project.hospitalManagementSystem.entity.Patient;
import com.springbootweb.project.hospitalManagementSystem.repository.AppointmentRepository;
import com.springbootweb.project.hospitalManagementSystem.repository.DoctorRepository;
import com.springbootweb.project.hospitalManagementSystem.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    @Transactional
    public Appointment createANewAppointment(Appointment appointment, Long patientId, Long doctorId) {
        Patient patient = patientRepository.findById(patientId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();

        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        appointmentRepository.save(appointment);

        return appointment;
    }

}
