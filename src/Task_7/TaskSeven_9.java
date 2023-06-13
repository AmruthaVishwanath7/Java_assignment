package Task_7;

public class TaskSeven_9 {
    public static void main(String[] args) {
        int[] arr={21,45,4,0,7,8};

        int max_value=Integer.MIN_VALUE;
        for(int i:arr){
            max_value=Math.max(max_value,i);
        }
        System.out.println("Maximum value in an array: "+max_value);
    }


}
