package com.hitesh.app.stock.service;

import com.hitesh.app.stock.models.StockDTO;

import java.util.List;

public interface StockService {

    List<StockDTO> getAllStocks();
}
