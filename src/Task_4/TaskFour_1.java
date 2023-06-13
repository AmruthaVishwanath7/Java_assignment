public class TaskFour_1 {
    public static int removeDuplicates(int a[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[n - 1];
        return j;
    }

    public static void main(String[] args) {
        int [] array ={ 1, 2, 2, 3, 3, 4, 4, 5, 6, 7, 7, 8, 9, 9 };
        int n = array.length;
        int j=0;
        j = removeDuplicates(array, n);
        System.out.println("The new array without duplicates: ");
        for (int i = 0; i < j; i++)
            System.out.print(array[i] + " ");
    }
}
