class Employee{
    public void displayBasicInfo(String name,double baseSalary){
        System.out.println("name="+name);
        System.out.println("basesalary="+baseSalary);

    }
}
class Developer extends  Employee{
    public void writeCode(String programmingLanguage){
        System.out.println("programminglanguage="+programmingLanguage);
    }

}
class Tester extends Employee{
    public  void runTests(String testingTool){
        System.out.println("testingtool="+testingTool);
    }

}
public class Employee_Main {
    public static void main(String[] args) {
     Developer d=new Developer();
     d.displayBasicInfo("pranay",1000000 );    
     d.writeCode("java");
     Tester t=new Tester();
     t.displayBasicInfo("pavan", 1000000);
     t.runTests("unittesing");
     

        
    }
    
}
