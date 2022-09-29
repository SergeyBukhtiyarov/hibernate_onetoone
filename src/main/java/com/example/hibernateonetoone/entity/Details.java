package com.example.hibernateonetoone.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String city;
    private String phone_number;
    private String email;

    @OneToOne(mappedBy = "empdetails", cascade = CascadeType.ALL)
    private Employee employee;

}
