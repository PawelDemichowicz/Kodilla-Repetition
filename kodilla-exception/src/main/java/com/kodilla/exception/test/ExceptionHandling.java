package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2, 1);
        } catch (Exception e){
            System.out.println("First number has to be <1,2) and second hasn't be 1.5" + "\n" + e);
        } finally {
            System.out.println("You wrote two numbers");
        }
    }
}
