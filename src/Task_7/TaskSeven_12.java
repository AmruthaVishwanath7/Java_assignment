package Task_7;

import java.util.HashMap;
import java.util.Map;

public class TaskSeven_12 {
    public static void main(String[] args) {
        TaskSeven_12 q12=new TaskSeven_12();
        int[] arr={4,2,-4,8,3,2};
        int target=6;
        System.out.println(q12.subarraySum(arr,target));
    }

    private int subarraySum(int[] arr,int target) {
        int count=0;
        int sum=0;
        int prefixSum=0;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            prefixSum+=arr[i];

            if(prefixSum==target)
                count+=1;

            if(hm.containsKey(prefixSum-target))
                count+=hm.get(prefixSum-target);

            hm.put(prefixSum,hm.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }

}
