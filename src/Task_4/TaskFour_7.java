import java.util.Arrays;

public class TaskFour_7 {
    public static void main(String[] args) {
        int[] array_nums = {51, 72, 22, 44, 19};
        System.out.println("Original Array: "+ Arrays.toString(array_nums));
        int max = array_nums[0];
        int min = array_nums[0];
        for(int i = 1; i < array_nums.length; i++)
        {
            if(array_nums[i] > max)
                max = array_nums[i];
            else if(array_nums[i] < min)
                min = array_nums[i];
        }
        System.out.println("Difference between the largest and smallest values : "+(max-min));
    }
}
