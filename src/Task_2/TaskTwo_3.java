public class TaskTwo_3 {
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        float avg = (a+b+c)/3;
        System.out.println("Average: "+avg);
        if(avg >a &&avg >b &&avg >c){
            System.out.println("Average is higher than a,b,c ");
        }
        else{
            if(avg>a) {
                if (avg > b) {
                    System.out.println("Average is higher than a,b ");
                } else if (avg > c) {
                    System.out.println("Average is higher than a,c");
                } else {
                    System.out.println("Average is higher than a");
                }
            } else if (avg>b) {
                if(avg>c){
                    System.out.println("Average is higher than b,c");
                }else
                    System.out.println("Average is higher than b");
            }else
                System.out.println("Average is higher than c");
        }
    }
}
