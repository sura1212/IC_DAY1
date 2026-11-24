import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        System.out.println("enter the num :");
        int num =scr.nextInt();
        System.out.println("num="+num);
        for(int i=1; i<=10; i++){
            System.out.println(num+ "X"+ i +"="+num*i);
        }
    }
    
}
