public class TaskFive_5 {
    public static void CheckForOdd(int[]array)
    {
        int size = array.length;
        for(int i=0; i<size; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("The even element to be seperated: "+array[i]);
            }
        }
    }
    public static void CheckForEven(int[]array){
            int size1 = array.length;
            for (int i = 0; i < size1; i++) {
                if (array[i] % 2 == 1) {
                    System.out.println("The odd element to be seperated: "+array[i]);
                }
            }
        }

    public static void main(String[] args) {
        int[] array={2,4,6,7,8,10};
        CheckForEven(array);
        int[] array1={3,5,7,4,9};
        CheckForOdd(array1);
    }
}
