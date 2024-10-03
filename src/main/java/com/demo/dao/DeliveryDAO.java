package com.demo.dao;

import com.demo.dto.DeliveryResponseDTO;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DeliveryDAO {

    public DeliveryResponseDTO getDelivery(String deliveryId) {
        return generateDeliveryDetails().get(deliveryId);
    }

    private Map<String, DeliveryResponseDTO> generateDeliveryDetails() {
        Map<String, DeliveryResponseDTO> deliveryMap = new HashMap<>();
        deliveryMap.put("d001", new DeliveryResponseDTO("d001", "ON THE WAY", "John Doe", "3.109.181.121:8082", 15));
        deliveryMap.put("d002", new DeliveryResponseDTO("d002", "DELIVERED", "Jane Doe", "3.109.181.121:8082", 0));
        return deliveryMap;
    }
}
