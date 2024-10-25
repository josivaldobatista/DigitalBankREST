package com.jfb.TransactionGateway.adapters.controllers.request;

import com.jfb.TransactionGateway.core.entities.TransactionType;

import java.math.BigDecimal;

public record TransactionRequest(
        TransactionType type,
        BigDecimal amount
) {
}
