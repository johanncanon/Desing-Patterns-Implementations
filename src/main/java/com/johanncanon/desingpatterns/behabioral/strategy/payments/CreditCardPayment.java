package com.johanncanon.desingpatterns.behabioral.strategy.payments;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class CreditCardPayment implements PaymentStrategy{

    private String cardNumber;
    private String cvv;

    public CreditCardPayment(String cvv, String cardNumber) {
        this.cvv = cvv;
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(Double amount) {
        // Create specific step´s method to process the payment with Credit Car.
        amount = amount * 5.9;
        log.info( "Processing payment of {} in credit card number: {}", amount, this.cardNumber );

    }
}
