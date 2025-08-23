package com.springbootweb.production_ready_features.production_ready_features;

import com.springbootweb.production_ready_features.production_ready_features.DTO.EmployeeDTO;
import com.springbootweb.production_ready_features.production_ready_features.client.EmployeeClient;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ProdReadyFeaturesApplicationTests {

    @Autowired
    private EmployeeClient employeeClient;

    @Test
    @Order(3)
    void getAllEmployeesTest() {
        List<EmployeeDTO> employeeDTOList = employeeClient.getAllEmployees();
        System.out.println(employeeDTOList);
    }

    @Test
    @Order(2)
    void getEmployeeByIdTest() {
        EmployeeDTO employeeDTO = employeeClient.getEmployeeById(1L);
        System.out.println(employeeDTO);
    }

    @Test
    @Order(1)
    void createNewEmployeeTest() {
        EmployeeDTO employeeDTO = new EmployeeDTO(null, "Pratika", "pratika@gmail.com", 21,
                "USER", 5000.0, LocalDate.of(2025, 8, 23), true);
        EmployeeDTO savedEmployeeDTO = employeeClient.createNewEmployee(employeeDTO);
        System.out.println(savedEmployeeDTO);
    }

}
