import java.util.Scanner;

public class TaskThree_7 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a month from 1-12");
        int month = sc.nextInt();
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        boolean leap = false;
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 Days in this Month");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Days in this Month");
                break;

            case 2:
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0)
                            leap = true;
                        else
                            leap = false;
                    }
                    else
                        leap = true;
                }
                else
                    leap = false;
                if(leap)
                System.out.println("29 Days in this Month");
                else System.out.println("28 Days in this Month");
                break;

            default:
                System.out.println("Please enter Valid Number between 1 to 12");
        }
    }
}
