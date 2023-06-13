import java.util.Scanner;

public class Tasktwo_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        if(num%5==0&&num%3==0 )
            System.out.println("Consultadd JAVA Training");
        else if(num%3==0)
            System.out.println("Consultadd");
        else if(num%5==0)
            System.out.println("JAVA Training ");
    }
}
