package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 5 positive, 5 negative
    // 1-100

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello. Please type a number between 1 and 100 and think of a question.");

        Integer number = scan.nextInt();


    // 10 options

        if(number < 11) {
            System.out.println("Most certainly.");

        }

        else if(number < 21 && number > 11) {
            System.out.println("Probably not.");

        }

        else if(number < 31 && number > 21) {
            System.out.println("Yeah, no.");

        }

        else if(number < 41 && number > 31) {
            System.out.println("Sounds amazing.");

        }

        else if(number < 51 && number > 41) {
            System.out.println("Yeah... I wouldn't.");

        }

        else if(number < 61 && number > 51) {
            System.out.println("I would stay well away from that...");

        }

        else if(number < 71 && number > 61) {
            System.out.println("You should probably think about something else...");

        }

        else if(number < 81 && number > 71) {
            System.out.println("Most likely.");

        }

        else if(number < 91 && number > 81) {
            System.out.println("Go for it!");

        }

        else if(number < 101 && number > 91) {
            System.out.println("That could happen.");

        }

        else {
            System.out.println("That isn't a number between 1 and 100.");
        }
    }
}
