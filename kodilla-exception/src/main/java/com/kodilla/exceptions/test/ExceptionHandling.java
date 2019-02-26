package com.kodilla.exceptions.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(0, 0);
        } catch (Exception e) {
            System.out.println("Given number is out of range");
        } finally {
            System.out.println("That's all.");
        }
    }
}
