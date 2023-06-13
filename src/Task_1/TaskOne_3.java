package Task_1;

import java.util.Scanner;

public class TaskOne_3 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter two numbers between 1 -10: ");
            int a = in.nextInt();
            int b = in.nextInt();
            int z = a+b;
            System.out.println("The Sum of two numbers: "+z);
            int total = z+30;
            System.out.println("Total Value After adding 30: "+total);
        }


}

