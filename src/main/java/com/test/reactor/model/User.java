package com.test.reactor.model;


import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Data
@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Integer age;



}
