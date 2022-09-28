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
    @Column(name = "details_id",insertable = false,updatable = false)
    private long details_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "details_id")
    private Details empdetails;


}
