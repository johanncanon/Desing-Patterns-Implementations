package com.johanncanon.desingpatterns.behabioral.strategy;

import com.johanncanon.desingpatterns.behabioral.strategy.context.PaymentContext;
import com.johanncanon.desingpatterns.behabioral.strategy.payments.BankTransferPayment;
import com.johanncanon.desingpatterns.behabioral.strategy.payments.CreditCardPayment;
import com.johanncanon.desingpatterns.behabioral.strategy.payments.PayPalPayment;

public class PaymentClient {

    public static void main(String[] args) {

        //Context Implementation
        PaymentContext context = new PaymentContext();

        //Credit Card
        context.setPaymentStrategy( new CreditCardPayment("611", "7362-74517-7562-7353") );
        context.executePayment( 100.00 );

        //PayPal API
        context.setPaymentStrategy( new PayPalPayment("johanncanon@ymail.com"));
        context.executePayment( 100.00 );

        //Bank Transfer
        context.setPaymentStrategy( new BankTransferPayment("9274-8645","Banlocombia","ahorros"));
        context.executePayment( 100.00 );

    }

}
