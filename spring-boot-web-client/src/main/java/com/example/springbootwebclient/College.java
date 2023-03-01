package com.example.springbootwebclient;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long collegeId;
    private String collageName;
    private String address;



}
