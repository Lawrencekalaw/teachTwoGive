/*Question 4: Capitalize Words
 * Write a program that accepts a string as input, capitalizes the first letter of each word in the string, and then returns the result string*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String choice = scanner.nextLine();
        String firstLetter = choice.substring(0, 1);
        String otherLetters = choice.substring(1, choice.length());
        firstLetter = firstLetter.toUpperCase();
        choice = firstLetter + otherLetters;
        System.out.println(choice);
    }
}