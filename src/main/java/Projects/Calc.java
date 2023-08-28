package Projects;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        System.out.println("================================================================");

        System.out.println("            [....SIMPLE CALCULATOR....]    ");

        System.out.println("================================================================");

        Scanner scan = new Scanner(System.in);

        System.out.println("Please use one of this operators: [ *, +, /, - ]");

        System.out.println("Enter the first number: ");
        int First_number = scan.nextInt();
        System.out.println("Enter the second number: ");
        int Second_number = scan.nextInt();

    }
}
