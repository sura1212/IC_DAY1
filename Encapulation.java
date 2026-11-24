class Car{
    private int speed=300;
    public void getter(){
        System.out.println("Speed="+speed);
    }
    public  void  setter(int s){
        speed=s;
    }
}
public class Encapulation {
    public static void main(String[] args) {
        Car c=new  Car();
        c.getter();
        c.setter(10000);
        c.getter();

        
    }

    
}
