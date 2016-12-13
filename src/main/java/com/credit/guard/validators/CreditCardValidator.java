package com.credit.guard.validators;

import com.credit.guard.data.TransactionData;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 13/12/2016.
 */
@Component
public class CreditCardValidator implements TransactionDataValidator {
    @Override
    public String validate(TransactionData data) {

        String cardNumber = data.getCardNumber();
        for (int i = 0; i < cardNumber.length(); i++) {
            Character character = cardNumber.charAt(i);
            if (!Character.isDigit(character) && character != '-') {
                return "credit card can contain only digigts or -";
            }

        }
        return null;
    }
}
