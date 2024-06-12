package com.example.fashionshop.entities;

import jakarta.persistence.*;

@Entity
public class SalesMan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn
    private UserRole userRole;
    @ManyToOne
    @JoinColumn
    private  RoleFunction roleFunction;
    @Column
    private String instruct;

    public SalesMan() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public RoleFunction getRoleFunction() {
        return roleFunction;
    }

    public void setRoleFunction(RoleFunction roleFunction) {
        this.roleFunction = roleFunction;
    }

    public String getInstruct() {
        return instruct;
    }

    public void setInstruct(String instruct) {
        this.instruct = instruct;
    }
}
