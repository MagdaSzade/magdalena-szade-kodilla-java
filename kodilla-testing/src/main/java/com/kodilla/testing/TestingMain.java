package com.kodilla.testing;

// import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        if (calculator.add(5,2) == 7) {
            System.out.println("Test add: OK");
        } else {
            System.out.println("Test add: Error!");
        }

        if (calculator.subtract(5,2) == 3) {
            System.out.println("Test subtract: OK");
        } else {
            System.out.println("Test subtract: Error!");
        }

        /* moduł 6.2 testowanie klasy SimpleUser;
        SimpleUser simpleUser = new SimpleUser("TheForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("TheForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        */
    }
}
