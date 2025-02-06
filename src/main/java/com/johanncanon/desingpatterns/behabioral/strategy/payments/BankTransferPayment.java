package com.johanncanon.desingpatterns.behabioral.strategy.payments;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BankTransferPayment implements PaymentStrategy{

    private String accountNumber;
    private String bankName;
    private String accountType;

    public BankTransferPayment(String accountNumber, String bankName, String accountType) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.accountType = accountType;
    }

    @Override
    public void processPayment(Double amount) {
        // Depend on the Bank API payment, this config have to be here.
        amount = amount * 0.50;
        log.info("Bank transfer payment: {} , Bank Name: {} , " +
                "Account Type: {} , Account Number: {}", amount, bankName, accountType, accountNumber);

    }
}
