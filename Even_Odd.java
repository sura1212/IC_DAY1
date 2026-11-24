import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        
    
    Scanner scr= new Scanner(System.in);
    System.out.println("enter the num :");
    int num= scr.nextInt();
    if(num%2==0){
        System.out.print("the is even="+ num);
    }
    else{
        System.out.println("the is odd="+num);
    }
    
}
}