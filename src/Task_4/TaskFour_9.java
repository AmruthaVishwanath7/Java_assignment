import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TaskFour_9 {
    public static ArrayList<Integer> twoSum(final List<Integer> a, int b) {

        HashMap<Integer, Integer> my_map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(1);
        for(int i = 0; i < a.size(); i++){
            if(my_map.containsKey(a.get(i))){
                int index = my_map.get(a.get(i));
                result.set(0, index );
                result.set(1, i );
                break;
            }
            else{
                my_map.put(b - a.get(i), i);
            }
        }

        return result;
    }

    public static void main(String[] args){
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(4);
        array.add(5);
        array.add(6);
        int target = 6;
        ArrayList<Integer> result = twoSum(array, target);
        for(int i : result)
            System.out.print("Index: "+i + " ");
    }
}
