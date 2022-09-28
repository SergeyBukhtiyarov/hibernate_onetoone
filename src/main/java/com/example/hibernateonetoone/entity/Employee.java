package com.example.hibernateonetoone.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    String surname;
    String department;
    long salary;
    long details_id;


}
