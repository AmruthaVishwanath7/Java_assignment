import java.util.Scanner;

public class TaskThree_6 {
    public static void main(String[] args) {
        System.out.println("Enter three Numbers:");
        Scanner in = new Scanner(System.in);
        int [] numbers= new int[3];
        for(int i=0;i<3;i++) {
            numbers[i] = in.nextInt();
        }
        if((numbers[0]<numbers[1])&&(numbers[1]<numbers[2])){
                System.out.println("INCREASING!");
        } else if ((numbers[0]>numbers[1]) &&(numbers[1]>numbers[2])){
                System.out.println("DECREASING!");
            }
        else {
            System.out.println("Neither Increasing nor Decreasing!");
        }
    }
}
