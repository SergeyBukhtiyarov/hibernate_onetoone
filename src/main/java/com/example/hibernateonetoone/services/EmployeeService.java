package com.example.hibernateonetoone.services;

import com.example.hibernateonetoone.entity.Employee;
import com.example.hibernateonetoone.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public void saveEmployee (Employee employee) {
        Employee employeeFromDB = employeeRepository.findById(employee.getId());
        if (employeeFromDB==null) {
            employeeRepository.save(employee);
        }
    }
}
