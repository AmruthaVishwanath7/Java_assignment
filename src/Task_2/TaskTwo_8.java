import java.util.Scanner;

public class TaskTwo_8 {
    public static void main(String[] args) {
        String s= "randomRANDOM";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        String a =sc.next();
        if(s.contains(a)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }

    }

}
