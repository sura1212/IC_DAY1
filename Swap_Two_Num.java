import java.util.Scanner;

public class Swap_Two_Num {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        
        System.out.println("enter the value of a :");
        int a=scr.nextInt();
        System.out.println("enter the value of b :");
        int b=scr.nextInt();
        System.out.println("a="+ a + " b ="+ b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("swap of num");
        System.out.println("a="+a);
        System.out.println("b="+b);
    
}
}
