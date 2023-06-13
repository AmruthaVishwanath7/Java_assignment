package Task_6;

public class TaskSix_4 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(2);
        Rectangle r3=new Rectangle(2,5);
        r1.area();
        r2.area();
        r3.area();
    }
}
class Rectangle{
    int length;
    int breadth;
    Rectangle(){}
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    Rectangle(int length_breadth){
        this.length=length_breadth;
        this.breadth=length_breadth;
    }
    public void area(){
        int area=this.length*this.breadth;
        System.out.println("Area : "+ area);
    }
}