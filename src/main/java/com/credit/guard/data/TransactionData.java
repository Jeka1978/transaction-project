package com.credit.guard.data;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

/**
 * Created by Evegeny on 13/12/2016.
 */
@Data
@Builder
public class TransactionData {
    @NonNull
    private String id;
    private String company;
    private String cardNumber;
}
