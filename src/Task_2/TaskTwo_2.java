import java.util.Scanner;
public class TaskTwo_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the options 1:Addition, 2:Subtraction, 3:Division, 4:Multiplication 5:Average");
        int option = in.nextInt();
        System.out.println("Enter the two numbers: ");
        int first = in.nextInt();
        int second = in.nextInt();
        switch(option){
            case 1: int sum = first+second;
                System.out.println("Sum: "+sum);
                if(sum<0)
                    System.out.println("Oops option 1 is returning the negative number");
                break;
            case 2: int diff = first-second;
                System.out.println("Difference: "+diff);
                if(diff<0)
                    System.out.println("Oops option 2 is returning the negative number");
                break;
            case 3: int div = first/second;
                System.out.println("Quotient: "+div);
                if(div<0)
                    System.out.println("Oops option 3 is returning the negative number");
                break;
            case 4: int prod = first*second;
                System.out.println("Product: "+prod);
                if(prod<0)
                    System.out.println("Oops option 3 is returning the negative number");
                break;
            case 5:
                System.out.println("Enter two more numbers: ");
                int first1= in.nextInt();
                int second1= in.nextInt();
                float average = (first+second+first1+second1)/4;
                System.out.println("Average: "+average);
                if(average<0)
                    System.out.println("Oops option 3 is returning the negative number");
                break;
            default:
                System.out.println("Entered a wrong option");

        }

    }
}
