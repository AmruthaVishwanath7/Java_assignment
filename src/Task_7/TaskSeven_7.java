package Task_7;

import java.util.HashMap;
import java.util.Map;

public class TaskSeven_7 {
    public static void main(String[] args) {
        TaskSeven_7 q7=new TaskSeven_7();
        String s="Amrutha";
        Map<Character,Integer> map=  q7.occurenceOfCharacters(s);
        q7.display(map);
    }

    private Map<Character,Integer> occurenceOfCharacters(String s) {

        Map<Character,Integer> map=new HashMap<>();
        char[] c=s.toLowerCase().toCharArray();

        //for(Character c:s.toCharArray()) {
        for(int i=0;i<s.length();i++){
            if (map.containsKey(c[i])) {
                map.put(c[i], map.get(c[i])+ 1);
            } else {
                map.put(c[i],1);
            }
        }
        return map ;
    }
    public void display(Map<Character,Integer> map){
        for(Map.Entry e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }

}
