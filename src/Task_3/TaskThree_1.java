import java.util.Scanner;

public class TaskThree_1 {
    public static void main(String[] args) {
        System.out.println("Enter the required multiplication table: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("The multiplication table is: ");
        for(int i =1; i<=10;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
}
