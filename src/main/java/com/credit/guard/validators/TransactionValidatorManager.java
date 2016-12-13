package com.credit.guard.validators;

import com.credit.guard.data.TransactionData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evegeny on 13/12/2016.
 */
@Service
public class TransactionValidatorManager {
    @Autowired
    private List<TransactionDataValidator> validators;

    public List<String> validate(TransactionData transactionData) {
        ArrayList<String> errors = new ArrayList<>();
        for (TransactionDataValidator validator : validators) {
            String validate = validator.validate(transactionData);
            if (validate != null) {
                errors.add(validate);
            }
        }
        return errors;
    }
}
