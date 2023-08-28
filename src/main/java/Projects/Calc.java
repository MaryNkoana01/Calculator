package Projects;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        System.out.println("             SIMPLE CALCULATOR....");

        System.out.println("================================================================");

        Scanner scan = new Scanner(System.in);

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        System.out.println("Please enter on of this operators: [ *, +, /, - ]");
    }
}
