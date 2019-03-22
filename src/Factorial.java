/*
Create a program that calculates the factorial of the number n. 
The factorial n! is calculated using the formula 1*2*3*...*n. 
For example 4! = 1*2*3*4 = 24. Additionally, it is defined that 0! = 1.
*/

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine()); //number we will take factorial of
        int factorial = 1;
        
        
        if (number == 0) {
            factorial = 1;
        }
        
        int i = 1;
        while (i <= number) {
            factorial = factorial * i;
            i++;
        }
        
        System.out.println("Factorial is " + factorial);
        
    }
}
