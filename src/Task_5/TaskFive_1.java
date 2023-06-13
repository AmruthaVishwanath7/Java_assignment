public class TaskFive_1 {
    public static void main(String[] args) {
        String[] words = { "hello", "goodbye", "welcome", "bye", "yes", "no", "yoo" };
        String smallest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }
        }

        System.out.println("The smallest word in the string is :"+ smallest);
    }
}
