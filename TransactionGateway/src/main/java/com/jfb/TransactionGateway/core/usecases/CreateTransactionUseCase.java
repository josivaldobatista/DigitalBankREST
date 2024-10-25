package com.jfb.TransactionGateway.core.usecases;

import com.jfb.TransactionGateway.adapters.controllers.request.TransactionRequest;
import com.jfb.TransactionGateway.core.entities.Transaction;
import com.jfb.TransactionGateway.core.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CreateTransactionUseCase {

    private final TransactionRepository repositoryRepository;

    @Autowired
    public CreateTransactionUseCase(TransactionRepository repository) {
        this.repositoryRepository = repository;
    }

    public void execute(TransactionRequest request) {
        if (request.amount().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Transação deve ser maior que zero.");
        }
        Transaction transaction = new Transaction(request.type(), request.amount());
        repositoryRepository.save(transaction);
    }
}
