import java.util.Scanner;

public class Largest_Three_num {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        System.out.println("enter value of a:");
        int a=scr.nextInt();
        System.out.println("enter the num of b");
        int b=scr.nextInt();
        System.out.println("entter the num of c");
        int c=scr.nextInt();
        System.out.println("a="+ a + "b="+ b  +"c="+c);
        if (a >= b && a >= c) {
            System.out.println(a + " is the largest");
        }
        else if (b >= a && b >= c) {
            System.out.println(b + " is the largest");
        }
        else {
            System.out.println(c + " is the largest");
        }
    
}
}
