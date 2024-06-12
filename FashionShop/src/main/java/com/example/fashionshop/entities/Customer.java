package com.example.fashionshop.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

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

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CustomerLevel getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(CustomerLevel customerLevel) {
        this.customerLevel = customerLevel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
