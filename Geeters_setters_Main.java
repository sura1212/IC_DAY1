class Student{
    String name="pranay";
    int rollNum=20;
    public void getRollNum() {
        System.out.println("rollnumber="+ rollNum);
    }
    public void getName(){
        System.out.println("name="+ name);

    }
    public  void setName(String s){
        name=s;
    }
     public  void setRollNum(int n){
        rollNum=n;
    }
}
public class Geeters_setters_Main {

    public static void main(String[] args) {
        Student s= new Student();
        s.getName();
        s.getRollNum();
        s.setName("kumar");
        s.setRollNum(12);
        s.getName();
        s.getRollNum();

        
    }
    
}
