/*Question2: Fibonacci sequence
 * Write a program to generate Fibonacci sequence up to 100 */

public class Main {
    public static void main(String[] args){
        int number1 = 0;
        int number2 = 1;
        int number3 = number1 + number2;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        while (number3 <= 100){
            number1 = number2;
            number2 = number3;
            number3 = number1 + number2;
            System.out.println(number3);

        }

    }
}