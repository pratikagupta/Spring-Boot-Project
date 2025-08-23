package com.springbootweb.production_ready_features.production_ready_features.client;

import com.springbootweb.production_ready_features.production_ready_features.DTO.EmployeeDTO;

import java.util.List;

public interface EmployeeClient {

    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO getEmployeeById(Long employeeId);

    EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO);
}
