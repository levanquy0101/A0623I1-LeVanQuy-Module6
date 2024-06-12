package com.example.fashionshop.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Statistical {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private LocalDateTime dateCreate;

}
