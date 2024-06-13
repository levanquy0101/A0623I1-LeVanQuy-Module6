package com.example.fashionshop.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String code;
    @Column
    private String name;

    @Column
    private LocalDate date;
    @Column
    private String gender;
    @Column
    private String address;
    @Column
    private String email;

    @Column
    private String phone;
    @ManyToOne
    @JoinColumn
    private CustomerLevel customerLevel;
    @Column
    private Integer points;
}
