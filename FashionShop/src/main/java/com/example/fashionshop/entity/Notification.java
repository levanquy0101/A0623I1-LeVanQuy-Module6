package com.example.fashionshop.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

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


    public Notification() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SalesMan getSalesMan() {
        return salesMan;
    }

    public void setSalesMan(SalesMan salesMan) {
        this.salesMan = salesMan;
    }

    public StockMan getStockMan() {
        return stockMan;
    }

    public void setStockMan(StockMan stockMan) {
        this.stockMan = stockMan;
    }

    public StoreManager getStoreManager() {
        return storeManager;
    }

    public void setStoreManager(StoreManager storeManager) {
        this.storeManager = storeManager;
    }

    public boolean isStatusRead() {
        return statusRead;
    }

    public void setStatusRead(boolean statusRead) {
        this.statusRead = statusRead;
    }
}
