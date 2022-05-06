package com.hitesh.app.stock.controller;

import com.hitesh.app.stock.models.StockDTO;
import com.hitesh.app.stock.service.StockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stocks")
public class StockController {

    private final static Logger logger = LoggerFactory.getLogger(StockController.class);

    @Autowired
    private StockService stockService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<StockDTO>> getAllStocks(){
        logger.info("request received for get all stocks");
        return ResponseEntity.ok(stockService.getAllStocks());
    }

    @RequestMapping(value="/{stockId}", method = RequestMethod.GET)
    public ResponseEntity<String> getSelectedStock(@PathVariable String stockId){
        System.out.println("stock id" + stockId);
        return ResponseEntity.ok("get single working");
    }

    @RequestMapping(method = RequestMethod.POST, @RequestBody )
    public ResponseEntity<String> createStock(){
        return ResponseEntity.ok("post working");
    }


    @RequestMapping(method = RequestMethod.PATCH)
    public ResponseEntity<String> updateStock(){
        return ResponseEntity.ok("post working");
    }
}
