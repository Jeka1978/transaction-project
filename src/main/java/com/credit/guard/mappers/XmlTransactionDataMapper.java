package com.credit.guard.mappers;

import com.credit.guard.consts.CGConst;
import com.credit.guard.data.TransactionData;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by Evegeny on 13/12/2016.
 */
@Component
public class XmlTransactionDataMapper implements TransactionDataMapper {
    @Override
    public TransactionData build(Map<String,String> map) {


        TransactionData transactionData = TransactionData.builder()
                .id(map.get("id"))
                .cardNumber(map.get("card"))
                .company(map.get(CGConst.COMPANY))
                .build();

        return transactionData;
    }

    @Override
    public String getIdentifier() {
        return CGConst.XML;
    }
}
