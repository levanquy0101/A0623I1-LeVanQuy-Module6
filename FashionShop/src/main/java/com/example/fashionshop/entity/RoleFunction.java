package com.example.fashionshop.entity;

import jakarta.persistence.*;

@Entity
public class RoleFunction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private Role role;

    @ManyToOne
    @JoinColumn
    private FuncSystem funcSystem;

    public RoleFunction() {
    }

    // Getter và setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public FuncSystem getFuncSystem() {
        return funcSystem;
    }

    public void setFuncSystem(FuncSystem funcSystem) {
        this.funcSystem = funcSystem;
    }
}
