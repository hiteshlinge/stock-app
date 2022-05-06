package com.hitesh.app.stock.models;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Data
public class StockDTO {

    private String name;
    private long id;
    private Double currentPrice;
    private LocalDateTime lastUpdated;
}
