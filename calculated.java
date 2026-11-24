class Rectangle{
    private double length=12;
    private  double width=4;
    public void getLength(){
        System.out.println("length="+length);
    }
    public  void getWidth(){
        System.out.println("width="+width);
    }

     public void calculateArea(){
            if(length >0 && width >0){
            System.out.println("area="+ (length*width));}
        }
        public  void calculatePerimeter(){
            if(length >0 && width >0){
            System.out.println("perimeter="+(2*(length+width)));}
        }
        public void setter(double l,double w){
            if(length >0 && width >0){
                length=l;
                width=w;
            }
        }
    
}
public class calculated {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.getLength();
        r.getWidth();
        r.calculateArea();
        r.calculatePerimeter();
        r.setter(45.25,58.24);
        r.getLength();
        r.getWidth();
        r.calculatePerimeter();
    }
    
}
