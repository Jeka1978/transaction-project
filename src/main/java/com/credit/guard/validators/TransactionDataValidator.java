package com.credit.guard.validators;

import com.credit.guard.data.TransactionData;

/**
 * Created by Evegeny on 13/12/2016.
 */
public interface TransactionDataValidator {
    String validate(TransactionData data);
}
