package Projects;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        System.out.println("================================================================");

        System.out.println("            [....SIMPLE CALCULATOR....]    ");

        System.out.println("================================================================");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = scan.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = scan.nextInt();

        System.out.println("Please use one of this operators: [ *, +, /, - ]");
        System.out.println("Enter the second number: ");

        char op = scan.next().charAt(0);
        int result = 0;

        switch (op) {
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                break;
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            default:
                System.out.println("Invalid operator selected.");
                return;
        }
        System.out.println("The answer is : " + firstNumber + " " + op + " " + secondNumber + " = " + result);

    }

}
