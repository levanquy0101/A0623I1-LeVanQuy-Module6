package com.example.fashionshop.entities;

import jakarta.persistence.*;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @ManyToOne
    @JoinColumn
    private ProductType productType;
    @Column
    private Double discount;
    @Column
    private String gif;
    @Column
    private String requirement;
    @Column
    private Integer points;

    public Team() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getGif() {
        return gif;
    }

    public void setGif(String gif) {
        this.gif = gif;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
