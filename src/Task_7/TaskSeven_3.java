package Task_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskSeven_3 {
    public static void main(String[] args) {
        TaskSeven_3 q3 = new TaskSeven_3();
        Integer[] arr1={1,2,3,4,5,6,7};
        Integer[] arr2={2,3,4,5,9,8,0};
        List<Integer> res=q3.intersection(arr1,arr2);
        System.out.println("Intersection elements: "+res);
    }

    private List<Integer> intersection(Integer[] arr1,Integer[] arr2) {
        List<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(arr1));
        List<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(arr2));
        List<Integer> list3=new ArrayList<>();

        for(int element:list1) {
            if (list1.contains(element) == list2.contains(element)) {
                list3.add(element);
            }
        }

        return list3;
    }
}
