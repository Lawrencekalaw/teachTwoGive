/*Question 3: Power of Two
 * Write a program that takes an integer as input and returns true if the input is a power of Two*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        if(number % 2 == 0){

            System.out.println( number + " => " + true);
        }else{

            System.out.println(number + " => " + false);
        }
    }
}