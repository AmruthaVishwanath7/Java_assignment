package Task_6;

public class TaskSix_6 {
    public static void main(String[] args) {
        Programming p1=new Programming();
        Programming p2=new Programming("Java");
        Programming p3=new Programming("Java,C");
        p1.print();
        p2.print();
        p3.print();
    }

}
class Programming{
    String str;
    Programming(){
        this.str="I love Programming languages";
    }
    Programming(String str){
        this.str="I love "+str;
    }
    public void print(){
        System.out.println(this.str);
    }
}
