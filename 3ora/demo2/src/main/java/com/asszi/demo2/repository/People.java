package com.asszi.demo2.repository;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer age;
    @Column(length = 20)
    private String name;
}
