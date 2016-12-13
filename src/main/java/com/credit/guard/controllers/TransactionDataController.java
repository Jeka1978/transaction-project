package com.credit.guard.controllers;

import com.credit.guard.data.TransactionData;
import com.credit.guard.services.TransactionDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Evegeny on 13/12/2016.
 */
@RestController
@RequestMapping("/api")
public class TransactionDataController {
    @Autowired
    private TransactionDataService service;

    @GetMapping("/transaction/{request}")
    public String response(@PathVariable String request) {
        TransactionData transactionData = service.createTransactionData(request);
        return transactionData.toString();
    }
}
