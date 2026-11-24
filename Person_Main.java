class Person{
    
    public  void displayPerson(String name){
        System.out.println("name="+name);
    }
}
class Employee extends  Person{
   
   public void displayEmployee(int employeeId){
   System.out.println("employeeId="+ employeeId);
   }
}
class Manager  extends  Employee{
    public void displayManager(String dep){
        System.out.println("dep="+dep);
    }
}
public class Person_Main {

    public static void main(String[] args) {
        Manager m= new Manager();
        m.displayEmployee(12);
        m.displayPerson("pranay");
        m.displayManager("hr");

        
    }
    
}

