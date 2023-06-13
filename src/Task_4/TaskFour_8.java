public class TaskFour_8 {
    public static void main(String[] args) {
        int array[] = {25, 20, 30, 45, 55, 55, 60, 60};
        System.out.println("Original length of the array: "+array.length);

        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
        int index = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[index-1])
                array[index++] = array[i];
        }
        System.out.println();
        System.out.println("The new array: ");
        for(int i =0; i<index; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("The new Length of array: "+index);
    }
}
