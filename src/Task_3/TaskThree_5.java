import java.util.Scanner;

public class TaskThree_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a long number: ");
        long number = sc.nextLong();
        long temp=1;
        int length =0;
        long sum=0,digit = 0;
        while (temp <= number) {
            length++;
            temp *= 10;
        }
        System.out.println("Number of digits in the number: "+length);
        while(number > 0){
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        System.out.println("Sum of Digits: "+sum);
    }
}

