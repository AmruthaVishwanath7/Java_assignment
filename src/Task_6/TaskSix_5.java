package Task_6;

public class TaskSix_5 {
    public static void main(String[] args) {
        AddAmount amt1=new AddAmount();
        amt1.display();
        amt1.transactions();
        AddAmount amt2=new AddAmount(50);
        amt2.display();
        amt2.transactions();
    }
}
class AddAmount{
    double amount=50;
    static int count=0;
    AddAmount(){
        this.amount+=0;
        count++;
    }
    AddAmount(double amount){
        this.amount+=amount;
        count++;
    }
    public void display(){
        System.out.println("Total Amount "+this.amount);
    }
    public void transactions(){
        System.out.println("No of transactions "+ count);
    }

}