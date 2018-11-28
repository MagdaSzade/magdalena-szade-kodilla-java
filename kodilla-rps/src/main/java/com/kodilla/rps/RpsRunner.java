package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RpsGameEngine game = new RpsGameEngine();

        Player human = new Player();
        Player computerAI = new Player();
        int winAmountToEndGame = 0;
        boolean end = false;

        System.out.println("Cześć! Będziemy grać w kamień, papier, nożyce! Podaj swoje imię.");
        human.setName(scanner.nextLine());
        System.out.println("Witaj " + human.getName()+ "!");
        System.out.println("Podaj do ilu wygranych będzie się toczyła gra.");
        winAmountToEndGame = scanner.nextInt();
        System.out.println("Zasady gry są nastepujące:");
        System.out.println("Aby wybrać \"kamień\" wciśnij \"1\".");
        System.out.println("Aby wybrać \"papier\" wciśnij \"2\".");
        System.out.println("Aby wybrać \"nożyce\" wciśnij \"3\".");
        System.out.println("Zaczynamy grę!");

        while(!end) {
            System.out.println("");
        }

    }
}
