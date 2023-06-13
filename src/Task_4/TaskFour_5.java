public class TaskFour_5 {
    public static void main(String[] args) {
        int array[] = {10, 7, 6, 13, 0, 0, 21, 9, 0, 6, 0, 2};
        int n = array.length;
        int c = 0;
        for (int i = 0; i < n; i++)
            if (array[i] != 0)
                array[c++] = array[i];
        while (c < n)
            array[c++] = 0;
        System.out.println("New Array: ");
        for (int i=0; i<n; i++)
            System.out.print(array[i]+" ");
    }
}
