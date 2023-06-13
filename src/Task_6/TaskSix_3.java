package Task_6;

public class TaskSix_3 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2 = new Student("Amrutha");
        System.out.println("Student_Name");
        s1.print();
        s2.print();
    }
}
class Student{
    private String name;
    Student(){
        this.name="Unknown";
    }

    Student(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void print(){
        System.out.println(this.getName());
    }
}
