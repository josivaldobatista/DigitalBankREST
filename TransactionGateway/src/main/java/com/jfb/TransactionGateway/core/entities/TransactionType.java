package com.jfb.TransactionGateway.core.entities;

import lombok.Getter;

@Getter
public enum TransactionType {
    DEPOSIT(0),
    WITHDRAWAL(1),
    TRANSFER(3);

    private final int code;

    TransactionType(int code) {
        this.code = code;
    }

}
