package Factorial;

import java.util.Scanner;

class FactorialUsingLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();

        int factorial = number;
        for (int i=1; i <= number-1; i++) {
            factorial *= (number - i);
        }

        System.out.println(
                String.format("%d factorial is: %d", number, factorial)
        );
    }
}