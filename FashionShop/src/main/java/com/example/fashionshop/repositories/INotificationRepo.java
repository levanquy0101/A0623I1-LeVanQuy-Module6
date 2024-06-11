package com.example.fashionshop.repositories;

import com.example.fashionshop.entity.Notification;
import com.example.fashionshop.entity.SalesMan;
import com.example.fashionshop.entity.StockMan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface INotificationRepo extends JpaRepository<Notification, Long> {
    List<Notification> findBySalesManAndStatusRead (SalesMan recipient, boolean read);
    List<Notification> findByStockManAndStatusRead (StockMan recipient, boolean read);
}
