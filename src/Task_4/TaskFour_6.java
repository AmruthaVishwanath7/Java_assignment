public class TaskFour_6 {
    public static void removeDuplicate(int arr[], int n) {

        int j = 0;

        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i+1]) {
                arr[j] = arr[i];
                j++;
            }
        }

        arr[j++] = arr[n-1];

        for (int i = 0; i < j; i++) {
            System.out.print(arr[i]+" ");
        }


    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 5, 7, 9};
        int n = arr.length;
        if (n > 1)
        {
            removeDuplicate(arr, n);
        }
    }
}
