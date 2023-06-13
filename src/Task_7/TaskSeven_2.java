package Task_7;

import java.util.*;

public class TaskSeven_2 {
    public static void main(String[] args) {
        TaskSeven_2 q2 = new TaskSeven_2();
        String str="amrutha";//"aJava plm";
        char res=q2.nonRepeatedCharacter(str);
        if(res=='0')
            System.out.println("There is no non repeating character");
        else
            System.out.println(res);
    }

    private char nonRepeatedCharacter(String s) {
        char[] ch=s.toCharArray();
        Map<Character,Integer> map= new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(ch[i])){
                map.put(ch[i],map.get(ch[i])+1);
            }else
                map.put(ch[i],1);
        }

        for (Map.Entry e:map.entrySet()) {
            if((int)e.getValue() == 1)
                return (char)e.getKey();
        }

        return '0';
    }
}