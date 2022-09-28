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

        Details details1= new Details();
        details1.setCity("Samara");
        details1.setEmail("bukhtiyarov@mail.com");
        details1.setPhone_number("1234567");

        Details details2= new Details();
        details2.setCity("Moscow");
        details2.setEmail("bukhtiyarov@mail.com");
        details2.setPhone_number("7654321");

        Details details3= new Details();
        details3.setCity("Norilsk");
        details3.setEmail("bukhtiyarov@mail.com");
        details3.setPhone_number("3456789");

        Employee employee1 = new Employee();
        employee1.setName("Sergey");
        employee1.setSurname("Bukhtiyarov");
        employee1.setDepartment("IT");
        employee1.setSalary(5000);
        employee1.setEmpdetails(details1);


        Employee employee2 = new Employee();
        employee2.setName("Mary");
        employee2.setSurname("Strizhneva");
        employee2.setDepartment("HR");
        employee2.setSalary(6000);
        employee2.setEmpdetails(details2);


        Employee employee3 = new Employee();
        employee3.setName("Alex");
        employee3.setSurname("Bukhtiyarov");
        employee3.setDepartment("Salary");
        employee3.setSalary(5000);
        employee3.setEmpdetails(details3);


        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);


        System.out.println(employee1);


    }




}
