import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
    Scanner scr =new Scanner(System.in);
    System.out.println("the enter num=");
    int num=scr.nextInt();
    int a,b,c;
    a=0;
    b=1;
    for(int i=0;i<=num;i++){
        
        System.out.print(a +" ");
        c=a+b;
        a=b;
        b=c;

    }


    }
    
}
