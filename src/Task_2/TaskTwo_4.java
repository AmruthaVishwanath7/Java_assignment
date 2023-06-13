import java.util.Scanner;

public class TaskTwo_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(;;){
            System.out.println("Enter a number: ");
            int num = in.nextInt();
            System.out.println("Good Going");
            if(num<0){
                System.out.println("Its over");
                break;
            }
        }
    }
}
