package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//


        Scanner Keyboard;
        int firstNumber = 1-10 ;
        int secondNumber = 11-20;
        int thirdNumber = 21-30;
        String Magic;
        Keyboard = new Scanner(System.in);
        Magic = Keyboard.nextLine();




            if (firstNumber==11) {
                System.out.println("You will become famous");
            }
                else if (firstNumber<0) {
                System.out.println("You will find $10");
            }

            if (secondNumber==24) {
                System.out.println("You will find true love");
            }

            else if (secondNumber<=15) {
                System.out.println("You will die alone");
            }


            if (thirdNumber==21) {
                System.out.println(" you will have 7 years of luck");
            }

            else if (thirdNumber<=25) {
                System.out.println("your dog died");
        }









    }
}


