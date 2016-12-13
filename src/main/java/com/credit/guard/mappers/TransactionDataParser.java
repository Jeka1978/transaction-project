package com.credit.guard.mappers;

import com.credit.guard.MapperNotFoundException;
import com.credit.guard.consts.CGConst;
import com.credit.guard.data.TransactionData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Evegeny on 13/12/2016.
 */
@Service
public class TransactionDataParser {
    @Autowired
    private Text2MapConverter text2MapConverter;
    private Map<String, TransactionDataMapper> mappers = new HashMap<>();

    @Autowired
    private void setMappers(List<TransactionDataMapper> mappers) {
        for (TransactionDataMapper mapper : mappers) {
            this.mappers.put(mapper.getIdentifier(), mapper);
        }
    }


    public TransactionData parse(String text) {
        Map<String, String> map = text2MapConverter.splitBy(text, "_");

        String identifier = map.get(CGConst.IDENTIFIER);
        TransactionDataMapper dataMapper = mappers.get(identifier);
        if (dataMapper == null) {
            throw new MapperNotFoundException("mapper not found for " + identifier);
        }
        return dataMapper.build(map);
    }
}
