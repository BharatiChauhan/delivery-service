package com.demo.controller;

import com.demo.dto.DeliveryResponseDTO;
import com.demo.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService service;

    @GetMapping("/status/{deliveryId}")
    public DeliveryResponseDTO getDeliveryStatus(@PathVariable String deliveryId) {
        return service.getDeliveryStatus(deliveryId);
    }
}
