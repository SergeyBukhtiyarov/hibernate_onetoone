package com.example.hibernateonetoone;

import com.example.hibernateonetoone.entity.Details;
import com.example.hibernateonetoone.entity.Employee;
import com.example.hibernateonetoone.repository.DetailsRepository;
import com.example.hibernateonetoone.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AddEmpToDB {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    DetailsRepository detailsRepository;

    @Test
    public void addEmpToDB () {
        Employee employee1 = new Employee();
        employee1.setName("Sergey");
        employee1.setSurname("Bukhtiyarov");
        employee1.setDepartment("IT");
        employee1.setSalary(5000);
        employee1.setDetails_id(1L);

        Employee employee2 = new Employee();
        employee2.setName("Mary");
        employee2.setSurname("Strizhneva");
        employee2.setDepartment("HR");
        employee2.setSalary(6000);
        employee2.setDetails_id(2L);

        Employee employee3 = new Employee();
        employee3.setName("Alex");
        employee3.setSurname("Bukhtiyarov");
        employee3.setDepartment("Salary");
        employee3.setSalary(5000);
        employee3.setDetails_id(3L);

        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);


    }




}
