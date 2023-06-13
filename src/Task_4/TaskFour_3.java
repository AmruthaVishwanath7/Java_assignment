public class TaskFour_3 {
    public static void main(String[] args) {
        int [] array ={ 1000,200,400,600,900,500};
        int firstS, secondS;
        if(array[0] < array[1]) {
            firstS = array[0];
            secondS = array[1];
        }
        else {
            firstS = array[1];
            secondS = array[0];
        }
        for (int i = 2; i < array.length; i++) {
            if(array[i] < firstS){
                secondS = firstS;
                firstS = array[i];
            }
            else if (array[i] > firstS && array[i] < secondS) {
                secondS = array[i];
            }
        }

        System.out.println("The second smallest Number: "+secondS);
    }
}
