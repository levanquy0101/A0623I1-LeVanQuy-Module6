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
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String title;
    @Column
    private String message;
    @Column
    private LocalDate createDate;
    @Column
    private boolean statusRead;
    @ManyToOne
    @JoinColumn
    private StoreManager storeManager;
    @ManyToOne
    @JoinColumn
    private SalesMan salesMan;
    @ManyToOne
    @JoinColumn
    private StockMan stockMan;

}
