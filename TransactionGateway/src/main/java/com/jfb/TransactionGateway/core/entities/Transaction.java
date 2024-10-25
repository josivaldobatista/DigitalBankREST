package com.jfb.TransactionGateway.core.entities;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    private String id;
    private TransactionType type;
    private BigDecimal amount;

    public Transaction(TransactionType type, BigDecimal amount) {
        this.type = type;
        this.amount = amount;
    }

    public int getTypeCode() {
        return type.getCode();
    }
}
