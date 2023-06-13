package Task_7;

import java.util.HashSet;
import java.util.Set;

public class TaskSeven_4 {
    public static void main(String[] args) {
        TaskSeven_4 q4 = new TaskSeven_4();
        String str = "amrutha";
        Boolean res = q4.uniqueCharacters(str);
        System.out.println("Unique Characters: "+res);
    }

    private Boolean uniqueCharacters(String s) {
        Set<Character> hset = new HashSet<>();
        for (Character ch : s.toCharArray()) {
            if (hset.contains(ch)) {
                return false;
            } else {
                hset.add(ch);
            }
        }
        return true;
    }
}
