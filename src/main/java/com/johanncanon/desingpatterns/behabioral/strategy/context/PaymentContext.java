package com.johanncanon.desingpatterns.behabioral.strategy.context;

import com.johanncanon.desingpatterns.behabioral.strategy.payments.PaymentStrategy;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(Double amount) {
        paymentStrategy.processPayment(amount);
    }

}
