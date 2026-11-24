import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        System.out.println("the enter num=");
        int num=scr.nextInt();
        int factorial=1;
        for(int i=num;i>=1;i--){
            factorial=factorial*i;
            

        }
        System.out.println(factorial);
    }
    
}
