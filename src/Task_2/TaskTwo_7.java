
import java.util.Scanner;

import static java.lang.Math.abs;

public class TaskTwo_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a floating point number: ");
        float num = sc.nextFloat();
        if(num == 0){
            System.out.println("The number is ZERO!");
        } else if (num<0) {
            System.out.println("The number is negative!");
        }else{
            System.out.println("The number is positive!");
            if(abs(num)<1){
                System.out.println("The number is small!!");
            }
            if(abs(num)>1000000){
                System.out.println("The number is large!!");
            }
        }
    }
}
