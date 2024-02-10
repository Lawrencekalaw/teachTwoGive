/*Question 6: Count Vowels
 * Write a program that counts the number of vowels in a sentence.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = scanner.nextLine();


        int count = 0;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            c = Character.toUpperCase(c);
            if(c=='A' || c=='E' || c== 'I' || c=='O' || c=='U'){
                count++;
            }
        }
        System.out.println("There is : " + count + " number of vowels.");

    }
}