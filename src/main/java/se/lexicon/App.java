package se.lexicon;

import java.util.Scanner;

public class App {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculations and result:");

        System.out.println("Enter your first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter your second number:");
        int num2 = scanner.nextInt();
        System.out.println("Enter your third number:");
        int num3 = scanner.nextInt();
        System.out.println("Enter your fourth number:");
        int num4 = scanner.nextInt();


        int average = ((num1 + num2 + num3) / num4);
        System.out.println("The avarage is " + average);
    }
}
