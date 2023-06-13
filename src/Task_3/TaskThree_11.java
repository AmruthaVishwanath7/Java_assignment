import java.util.Scanner;

public class TaskThree_11 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input 2 floating point numbers: ");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        num1 = Math.round(num1 * 100);
        num1 = num1 / 100;
        num2 = Math.round(num2 * 100);
        num2 = num2 / 100;
        System.out.println(num1);
        System.out.println(num2);
        if (num1 == num2) {
            System.out.println("Numbers are the same up to two decimal places");
        }
        else {
            System.out.println("Numbers are not same");
        }
    }
}
