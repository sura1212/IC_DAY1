class Animal{
    public void displayName(String name, String eat){
        System.out.println("name="+name);
        System.out.println("eat="+eat);

    }

}
class Dog extends Animal{
    public  void displayBark(String breed, String bark ){
        System.out.println("breed="+breed);
        System.out.println("bark="+bark);

    }
}
public class Animal_Main {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.displayName("kip", "food");
        d.displayBark("x", "yes");
        

        
    }
    
}
