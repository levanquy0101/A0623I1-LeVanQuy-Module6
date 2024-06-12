package com.example.fashionshop.entities;

import jakarta.persistence.*;

@Entity
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;
    @ManyToOne
    @JoinColumn
    private ProductTarget target;

    public ProductType() {
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

    public ProductTarget getTarget() {
        return target;
    }

    public void setTarget(ProductTarget target) {
        this.target = target;
    }
}
