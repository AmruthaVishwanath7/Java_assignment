import java.util.Scanner;

public class TaskThree_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum =0;
        for(int i =1; i<=n;i++){
            sum+=i;
        }
        System.out.println("The sum of "+n+" Natural numbers is "+sum);
    }
}
