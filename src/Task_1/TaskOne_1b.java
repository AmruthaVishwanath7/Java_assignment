package Task_1;

public class TaskOne_1b {
    public static void main(String[] args) {
        int num1 = 10,num2= 20;
        System.out.println("First Number: "+num1);
        System.out.println("Second number: "+num2);
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("*****After Swap*****");
        System.out.println("First Number: "+num1);
        System.out.println("Second number: "+num2);

    }
}
