package com.burakkutbay.springdataredisproject.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Table
@Entity
@Data
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nameSurname;

    private int schoolNumber;

    private String branch;

}
