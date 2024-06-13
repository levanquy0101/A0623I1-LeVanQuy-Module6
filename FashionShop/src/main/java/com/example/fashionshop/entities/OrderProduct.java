package com.example.fashionshop.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private Date orderDate;
    @ManyToOne
    @JoinColumn
    private Customer customer;
    @JoinColumn
    @ManyToOne
    private Product product;
    @Column
    private double totalAmount;
}
