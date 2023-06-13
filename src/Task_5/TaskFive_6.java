public class TaskFive_6 {
    public static void main(String []args){
        char c = 0;
        String s = "HELLOWorld";
        System.out.println("String in lowercase: "+s);
        // length of string
        int len = s.length();
        StringBuffer strBuffer = new StringBuffer(len);
        for (int i = 0; i < len; i++) {
            c = s.charAt(i);
            if (Character.isTitleCase(c)) {
                c = Character.toLowerCase(c);
            }
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);}
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }
            strBuffer.append(c);
        }
        System.out.println("Converted String : "+strBuffer.toString());
    }

}
