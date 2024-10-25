package com.jfb.TransactionGateway.core.repositories.impl;

import com.jfb.TransactionGateway.core.entities.Transaction;
import com.jfb.TransactionGateway.core.repositories.TransactionRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionRepositoryImpl implements TransactionRepository {

    @Override
    public void save(Transaction transaction) {
        int typeCode = transaction.getTypeCode();
    }
}
