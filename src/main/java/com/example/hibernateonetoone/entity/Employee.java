package com.example.hibernateonetoone.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;
    private String department;
    private long salary;

    @OneToOne(cascade = CascadeType.ALL)
    private Details empdetails;


}
