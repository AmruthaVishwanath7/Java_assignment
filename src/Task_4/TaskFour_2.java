public class TaskFour_2 {
    public static void main(String[] args) {
        int [] array ={ 1000,200,400,600,900,500};
        int firstL, secondL;
        if(array[0] > array[1]) {
            firstL = array[0];
            secondL = array[1];
        }
        else {
            firstL = array[1];
            secondL = array[0];
        }
        for (int i = 2; i < array.length; i++) {
            if(array[i] > firstL){
                secondL = firstL;
                firstL = array[i];
            }
            else if (array[i] < firstL && array[i] > secondL) {
                secondL = array[i];
            }
        }

        System.out.println("The second Largest Number: "+secondL);
    }
}
