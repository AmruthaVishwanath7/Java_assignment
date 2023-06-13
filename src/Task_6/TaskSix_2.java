class Employee{
    private String name;
    private int year;
    private String address;

    Employee(){}
    Employee(String name,int year,String address){
        this.name=name;
        this.year=year;
        this.address=address;
    }
    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
    public String getAddress(){
        return this.address;
    }
    public void print(){
        System.out.println(this.getName()+"\t"+ this.getYear()+"\t"+"\t"+this.getAddress());
    }
}
public class TaskSix_2 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Robert",1994,"64C-Walls Street");
        Employee e2 = new Employee("Sam ",2000,"68D-Walls Street");
        Employee e3 = new Employee("John",1999,"26B-Walls Street");
        System.out.println("Name\t"+ "Year\t"+"Salary\t"+"Address");
        e1.print();
        e2.print();
        e3.print();
    }
}
