package com.credit.guard.services;

import com.credit.guard.mappers.TransactionDataParser;
import com.credit.guard.data.TransactionData;
import com.credit.guard.validators.TransactionValidatorManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Evegeny on 13/12/2016.
 */
@Service
public class TransactionDataService {

    @Autowired
    private TransactionDataParser transactionDataParser;

    @Autowired
    private TransactionValidatorManager validator;


    public TransactionData createTransactionData(String text) {
        TransactionData transactionData = transactionDataParser.parse(text);
        List<String> errors = validator.validate(transactionData);
        if (errors.isEmpty()) {
            return transactionData;
        }
        throw new RuntimeException(errors.toString());
    }
}
