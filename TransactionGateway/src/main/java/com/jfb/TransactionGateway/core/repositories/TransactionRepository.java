package com.jfb.TransactionGateway.core.repositories;

import com.jfb.TransactionGateway.core.entities.Transaction;

public interface TransactionRepository {
    void save(Transaction transaction);
}
