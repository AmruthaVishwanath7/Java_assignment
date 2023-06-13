package Task_7;

public class TaskSeven_1 {
    public static void main(String args[]){
        String str= "Hello", newstr="";
        char ch;

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            newstr= ch+newstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ newstr);

    }
}
