class Vehicle{
     String modeName="bmwX90";
    public  void honk(){
        System.out.println("beep ! beep!");
    }

}
class Car extends Vehicle{

    public void displayDetails(){
    
        
        System.out.println(modeName);
        
    }

   

}
public class inheritenc_Main {

    public static void main(String[] args) {
        Car c=new Car();
        Vehicle v=new Vehicle();
        System.out.println(v.modeName);
        c.honk();
        c.displayDetails();
        
    }
    
}
