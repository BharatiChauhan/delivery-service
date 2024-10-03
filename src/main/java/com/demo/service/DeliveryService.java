package com.demo.service;

import com.demo.dao.DeliveryDAO;
import com.demo.dto.DeliveryResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

    @Autowired
    private DeliveryDAO deliveryDAO;

    public DeliveryResponseDTO getDeliveryStatus(String deliveryId) {
        return deliveryDAO.getDelivery(deliveryId);
    }
}
