package com.pruralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        System.out.print("Please enter the game score in format[Home:Visitor|21:9]");
        String Score = newScanner.nextLine();
        System.out.println("Score" + " " + Score);
        String[] parseScore = Score.split("[|:]");

        String Team1 = parseScore[0].trim();
        System.out.println(Team1);
        String Team2 = parseScore[1].trim();
        System.out.println(Team2);
        int Score1 = Integer.parseInt(parseScore[2]);
        System.out.println(Score1);
        int Score2 = Integer.parseInt(parseScore[3]);
        System.out.println(Score2);

        if (Score1 < Score2) {
            System.out.println("Winner:" + " " + Team2);
        } else if (Score1 == Score2) {
            System.out.println("Winner:" + " " + "Tie!");
        } else {
            System.out.println("Winner:" + " " + Team1);
        }
    }
}

