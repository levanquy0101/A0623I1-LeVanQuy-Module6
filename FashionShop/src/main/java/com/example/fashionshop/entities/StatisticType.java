package com.example.fashionshop.entities;

import jakarta.persistence.*;

@Entity
public class StatisticType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;
    @Column
    private boolean byDay;
    private boolean byMonth;
    private boolean byYear;
}
