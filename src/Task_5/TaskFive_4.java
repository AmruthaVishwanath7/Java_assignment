import java.util.Arrays;

public class TaskFive_4 {
    static boolean is_isogram(String str)
    {
        str = str.toLowerCase();
        int len = str.length();
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "Amrutha";
        System.out.println("Isogram:"+is_isogram(str1));
    }
}
