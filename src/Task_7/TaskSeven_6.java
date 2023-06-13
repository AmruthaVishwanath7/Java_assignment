package Task_7;

import java.util.Scanner;

public class TaskSeven_6 {
    public static boolean isarmstrong(int n){
        int temp,digit=0,last=0,sum=0;
        temp =n;
        while(temp>0){
            temp = temp/10;
            digit++;
        }
        temp =n;
        while(temp>0){
            last = temp%10;
            sum += Math.pow(last,digit);
            temp = temp/10;
        }
        if(n==sum)
            return true;
        else
            return false;
    }
    public static void main(String args[]){

        int n = 153;//407,370
        boolean arm = isarmstrong(n);
        if(arm)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an armstrong num");

    }
}
