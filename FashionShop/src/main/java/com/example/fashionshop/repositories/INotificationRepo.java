package com.example.fashionshop.repositories;

import com.example.fashionshop.entities.Notification;
import com.example.fashionshop.entities.SalesMan;
import com.example.fashionshop.entities.StockMan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface INotificationRepo extends JpaRepository<Notification, Long> {
    List<Notification> findBySalesManAndStatusRead (SalesMan recipient, boolean read);
    List<Notification> findByStockManAndStatusRead (StockMan recipient, boolean read);
}
