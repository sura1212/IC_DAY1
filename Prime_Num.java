import java.util.Scanner;

public class Prime_Num {
    public static void main(String[] args) {
        Scanner scr =new Scanner(System.in);
        int num=scr.nextInt();
        System.out.println("num="+num);
        if(num%2==0){
            System.out.println("the is primenum="+num);
        }
        else{
            System.out.println("the num is not prime num="+num);
        }
    }
    
}
