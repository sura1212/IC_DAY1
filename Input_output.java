import java.util.Scanner;

public class Input_output {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        /*simple caluiator use  +,-*,/,% */
        System.out.println("enter the value of a :");
        int a=scr.nextInt();
        System.out.println("enter the value of a :");
        int b=scr.nextInt();
        System.out.println("a="+ a + " b ="+ b);
        System.out.println("the enter the case number=");
        int c=scr.nextInt();
        
        switch (c) {
            case 1:
                System.out.println("a+b="+(a+b));
                
                break;
            case 2:
                System.out.println(" a-b="+(a-b));
                break;
            case 3:
                System.out.println("a*b="+(a*b));
                break;
            case 4:
                System.out.println("a/b="+(a/b));
                break;

        
            default:
                System.out.println("a="+ a + " b="+ b);
                break;
        }
    

    }
}
