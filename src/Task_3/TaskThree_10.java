import java.util.Scanner;

public class TaskThree_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n = in.nextInt();
        int x = 1;
        int r,c;

        for(r=0; r<n; r++){
            //blank space
            for(int k=0; k<n-r; k++)
                System.out.print(" ");

            for(c=0; c<=r; c++){
                if(c==0 || r==c)
                    x= 1;
                else
                    x = x * (r-c + 1)/c;
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
