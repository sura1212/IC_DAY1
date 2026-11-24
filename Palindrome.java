import java.util.Scanner;

public class Palindrome {
      public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scr.nextInt();

        int temp = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (temp == reverse) {
            System.out.println("Yes, the number is a palindrome.");
        } else {
            System.out.println("No, the number is not a palindrome.");
        }

        scr.close();
    }
}

