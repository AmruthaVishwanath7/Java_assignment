package Task_7;

public class TaskSeven_10 {
    public static void main(String[] args) {
        TaskSeven_10 q10=new TaskSeven_10();
        String str="xyz";
        q10.combination(str,new StringBuffer(), 0);
    }

    public void combination(String instr, StringBuffer outstr, int index)
    {
        if(index==instr.length()){
            return;
        }

        for (int i = index; i < instr.length(); i++)
        {
            outstr.append(instr.charAt(i)); //choose
            System.out.println(outstr);
            combination(instr, outstr, i + 1); //explore
            outstr.deleteCharAt(outstr.length() - 1); //unchoose
        }
    }
}
