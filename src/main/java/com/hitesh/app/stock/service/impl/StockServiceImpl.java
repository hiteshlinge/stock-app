package com.hitesh.app.stock.service.impl;

import com.hitesh.app.stock.models.StockDTO;
import com.hitesh.app.stock.service.StockService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service("stockService")
public class StockServiceImpl implements StockService {

    private List<StockDTO> data = new ArrayList<>();

    {
        data.add(StockDTO.builder().name("abc").id(1l).currentPrice(19.00).lastUpdated(LocalDateTime.now()).build());
    }

    @Override
    public List<StockDTO> getAllStocks() {
        return data;
    }
}
