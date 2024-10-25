package com.jfb.TransactionGateway.adapters.controllers;

import com.jfb.TransactionGateway.adapters.controllers.request.TransactionRequest;
import com.jfb.TransactionGateway.core.usecases.CreateTransactionUseCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final CreateTransactionUseCase createTransactionUseCase;

    public TransactionController(CreateTransactionUseCase createTransactionUseCase) {
        this.createTransactionUseCase = createTransactionUseCase;
    }

    @PostMapping
    public ResponseEntity<String> createTransaction(@RequestBody TransactionRequest request) {
        log.info("Received request to create transaction: {}", request);
        createTransactionUseCase.execute(request);
        log.info("Transaction created successfully!");
        return ResponseEntity.ok("Transação criada com sucesso");
    }

    @GetMapping("/test")
    public ResponseEntity<String> testEndPoint() {
        log.info("Test endpoint called");
        return ResponseEntity.ok("API esá funcionando!");
    }
}
