package Task_7;

public class TaskSeven_8 {
    public static void main(String[] args) {
        TaskSeven_8 q8=new TaskSeven_8();
        String s="xyz" ;
        q8.permutationString(s,0,s.length()-1);
    }

    private void permutationString(String str,int l,int r) {
        if(l==r){
            System.out.println(str);
            return;
        }
        for(int i=l;i<=r;i++){
            str=swap(str,l,i); //choose
            permutationString(str, l+1, r); //explore
            str=swap(str, l, i); //unchoose
        }
    }
    public String swap(String str, int l,int r){
        char[] s=str.toCharArray();
        char temp = s[l];
        s[l] =s[r];
        s[r]=temp;
        return String.valueOf(s);
    }
}
