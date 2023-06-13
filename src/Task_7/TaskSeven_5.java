package Task_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskSeven_5 {
    public static void main(String[] args) {
        TaskSeven_5 q5= new TaskSeven_5();
        String str="I love Coding";
        int size= q5.numOfWords(str);
        System.out.println("Number of words in a string: "+size);

    }

    private int numOfWords(String s) {
        List<String> list=new ArrayList<>();
        list.addAll(Arrays.asList(s.split(" ")));
        return list.size();
    }
}
