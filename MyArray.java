import java.lang.reflect.Array;
import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("enter the size");
         int size=scr.nextInt();
         int a[]=new int[size];
         System.out.println("the elem of array");
         for(int i=0; i<size;i++){
            a[i]=scr.nextInt();
         }
         for(int i=0;i<size;i++){
            System.out.print(a[i] + " ");
         }
        
        int max=a[0],min=a[0];
        for(int i=0; i<size;i++){
            if(a[i]>max){
                max=a[i];


            }
        }
        System.out.println("the max of array"+max);
        for(int i=0; i<size;i++){
            if(a[i]<min){
                min=a[i];


            }
        }
        System.out.println("the min of array"+min);
        for(int i=0;i<size;i++){
            for(int j=0;j<a.length-1;i--){
                if(a[j]<a[j+1]){
                   int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("the array after sorting");
        for(int i=0;i<size;i++){
            System.out.print(a[i] + " ");
         }
    }
    
}
