/*Question 1: FizzBuzz
 * Write a program that prints the numbers from 1 to 100. For multiples of 3, print "Fizz"; for multiples of 5, print "Buzz"; and for numbers that are multiples of both 3 and 5, print "FizzBuzz"*/

public class Main {
    public static void main(String[] args) {

        int number;
        for (number = 0; number <= 100; number ++){
            if (number % 3 == 0 && number % 5 == 0){

                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");

            } else if (number % 5 == 0) {
                System.out.println("Buzz");

            }
            else {
                System.out.println(number);
            }
        }
    }
}