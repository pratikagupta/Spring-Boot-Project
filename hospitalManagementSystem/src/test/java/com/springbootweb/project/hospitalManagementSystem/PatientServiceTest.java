package com.springbootweb.project.hospitalManagementSystem;


import com.springbootweb.project.hospitalManagementSystem.dto.BloodGroupStats;
import com.springbootweb.project.hospitalManagementSystem.dto.CPatientInfo;
import com.springbootweb.project.hospitalManagementSystem.dto.IPatientInfo;
import com.springbootweb.project.hospitalManagementSystem.entity.Patient;
import com.springbootweb.project.hospitalManagementSystem.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testPatient() {
//        List<IPatientInfo> patientList = patientRepository.getAllPatientsInfo();
//        for(IPatientInfo p: patientList) {
//            System.out.println(p);
//        }

//        List<CPatientInfo> patientList = patientRepository.getAllPatientsInfoConcrete();
//        for(CPatientInfo p: patientList) {
//            System.out.println(p);
//        }

//        List<BloodGroupStats> patientList = patientRepository.getBloodGroupStats();
//        for(BloodGroupStats p: patientList) {
//            System.out.println(p);
//        }

        List<Patient> patientList = patientRepository.getAllPatientsWithAppointments();

        for(var p: patientList) {
            System.out.println(p); 
        }
    }
}
