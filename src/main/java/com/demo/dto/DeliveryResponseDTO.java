package com.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryResponseDTO {

    private String deliveryId;
    private String status;
    private String driverName;
    private String trackingUrl;
    private int estimatedTime;
}
