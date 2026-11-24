class shape{
    String color="red";
    public void displayColor(){
        System.out.println("color="+color);
    }
}
class circle extends shape{
    

  public  void displayArea(int r){
    System.out.println("area circle"+(3.14*r*r));
  }
}
class Rectangle extends shape{
    public void displayArea(int l,int w){
        System.out.println("area  rectangle="+(l*w));
    }

}
public class shape_Main {

    public static void main(String[] args) {
        circle c=new circle();
        c.displayArea(23);
        c.displayColor();
        Rectangle r=new Rectangle();
        r.displayArea(20, 6);
        r.displayColor();
        
    }
    
}
