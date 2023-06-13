public class TaskFive_2 {
    public static void main(String[] args) {
        int [] array ={ 1000,200,400,600,900,500};
        int largest= array[0];
        int smallest = array[0];
        for(int i=1;i< array.length;i++){
            if(array[i]>largest){
                largest = array[i];
            }
        }
        for(int i=1;i< array.length;i++){
            if(array[i]<smallest){
                smallest = array[i];
            }
        }
        System.out.println("Largest: "+largest);
        System.out.println("Smallest: "+smallest);
        int sum=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==largest||array[i]==smallest){
                continue;
            }
            sum+=array[i];
        }
        System.out.println("The Sum of the array except smallest and largest: "+sum);
    }
}
