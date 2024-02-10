/* Question 5: Reverse integer
 * Write a program that takes an integer as input and returns an integer with reversed digit ordering*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int choice = scanner.nextInt();

        int reversed = 0;
        while (choice != 0){
            int digit = choice % 10;
            reversed = reversed * 10 + digit;
            choice /= 10;
        }
        System.out.println(reversed);

    }
}