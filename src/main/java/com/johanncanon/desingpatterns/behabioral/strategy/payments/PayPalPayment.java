package com.johanncanon.desingpatterns.behabioral.strategy.payments;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PayPalPayment implements PaymentStrategy{

    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(Double amount) {
        // Method to process the payment via PayPal, implementing the PayPal API
        amount = amount * 1.90;
        log.info( "Payment via Paypal: {}, email: {}", amount, email );
    }
}
