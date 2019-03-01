package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //
        String firstResponse = "You will have seven years of luck  ";
        String secondResponse = "You will get a puppy";
        String thirdResponse = "You will find $10";
        String fourthResponse = " You are going to have a good day";
        String fifthResponse = "You will be the happiest person in the world";
        String sixthResponse = "You will fall in a hole";
        String seventhResponse = "you will have seven years of bad luck";
        String eighthResponse = "you will fail school";
        String ninthResponse = "you will die";
        String tenthResponse = "you have no friends";
        String eleventhResponse = "Try Again";
        String Magic;

        //you are filling this number out by what the user gives you.
        int number = 14;



        if (number > 0 && number < 10) {
            System.out.println(firstResponse);
        } else if (number <= 10) {
            System.out.println(secondResponse);
        } else if (number > 10 && number < 20) {
            System.out.println(thirdResponse);
        } else if (number > 20 && number < 30) {
            System.out.println(fourthResponse);
        } else if (number > 30 && number < 40) {
            System.out.println(fifthResponse);
        } else if (number > 40 && number < 50) {
            System.out.println(sixthResponse);
        } else if (number > 50 && number < 60) {
            System.out.println(seventhResponse);
        } else if (number > 60 && number < 70) {
            System.out.println(eighthResponse);
        } else if (number > 70 && number < 80){
            System.out.println(ninthResponse);
        } else if (number > 80 && number < 90){
            System.out.println(tenthResponse);
        } else if (number > 90 && number < 100){
            System.out.println(eleventhResponse);
        }


        }
    }