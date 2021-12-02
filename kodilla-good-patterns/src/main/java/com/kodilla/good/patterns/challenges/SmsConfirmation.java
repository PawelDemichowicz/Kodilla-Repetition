package com.kodilla.good.patterns.challenges;

public class SmsConfirmation implements InformationService {

    @Override
    public void sendConfirmation(Customer customer) {
        System.out.println("Send message to customer");
    }
}
