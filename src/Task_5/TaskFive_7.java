public class TaskFive_7 {
        public static void main(String[] args) {
            boolean balanced = false;
            String inputStr ="{}[]()";
            int i, length, j=0, count=0;
            char current, ch;
            char[] stack = new char[20];
            length = inputStr.length();
            for(i = 0; i < length; i++) {
                current = inputStr.charAt(i);
                if(current =='(' || current =='{' || current =='[') {
                    stack[j] = current;
                    j++;
                    count = 1;
                } else if(current == ')') {
                    if(count == 1)
                        j--;
                    ch = stack[j];
                    if(stack.length == 0 || ch != '(') {
                        balanced=false;
                        System.out.println("Balanced: "+balanced);
                        return;
                    }
                } else if(current == '}') {
                    if(count == 1)
                        j--;
                    ch = stack[j];
                    if(stack.length == 0 || ch != '{') {
                        balanced = false;
                        System.out.println("Balanced: "+balanced);
                        return;
                    }
                } else if(current == ']') {
                    if(count == 1)
                        j--;
                    ch = stack[j];
                    if(stack.length == 0 || ch != '[') {
                        balanced=false;
                        System.out.println("Balanced: "+balanced);
                        return;
                    }
                }
            }
            balanced = true;
            System.out.println("Balanced: "+balanced);
        }
}
