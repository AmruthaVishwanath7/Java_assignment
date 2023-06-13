import java.util.Scanner;

public class TaskThree_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int[] array = new int[10];
        int sum=0;
        float avg;
        for(int i =0; i<10;i++){
            array[i] =in.nextInt();
        }
        for(int i =0; i<10;i++){
            sum+=array[i];
        }
        System.out.println("Array sum is : "+sum);
        avg = sum/10.0f;
        System.out.println("Average is: "+avg);
    }
}
