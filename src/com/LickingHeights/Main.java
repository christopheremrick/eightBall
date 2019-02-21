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

        if(number < 21 && number > 11) {
            System.out.println("Probably not.");

        }

        if(number < 31 && number > 21) {
            System.out.println("Yeah, no.");

        }

        if(number < 41 && number > 31) {
            System.out.println("Sounds amazing.");

        }

        if(number < 51 && number > 41) {
            System.out.println("Yeah... I wouldn't.");

        }

        if(number < 61 && number > 51) {
            System.out.println("I would stay well away from that...");

        }

        if(number < 71 && number > 61) {
            System.out.println("You should probably think about something else...");

        }

        if(number < 81 && number > 71) {
            System.out.println("Most likely.");

        }
        if(number < 91 && number > 81) {
            System.out.println("Go for it!");

        }
    }
}
