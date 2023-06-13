import java.util.Scanner;

public class TaskThree_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number from 1-12 for months: ");
        int num = in.nextInt();
        if(num == 1||num ==3|| num ==5|| num ==7||num ==8||num==10||num ==12){
            System.out.println("Number of days is: 31");
        } else if (num == 4|| num==6||num==9||num ==11) {
            System.out.println("Number of days is : 30");
        }else if(num ==2){
            System.out.println("Number of days is either 28 or 29 ");
        }else{
            System.out.println("Invalid Details");
        }
    }
}
