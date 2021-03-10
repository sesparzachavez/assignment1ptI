import java.util.Random;

public class randomizedQS implements Sort{
    public randomizedQS() {
    }

    public static void randomizedQS(double [] arr, int low, int high){
        if(low < high){
            int j = partition(arr, low,high);
            randomizedQS(arr,low, j-1);
            randomizedQS(arr, j+1, high);
        }
    }

    public static int partition(double[] arr, int low, int high){
       // double pivot = arr[low];
        Random rnd = new Random();
        double pivot = arr[low + rnd.nextInt(high - low)];
        int i = low+1;
        int j = high;

        while(i<=j){
            while((i <= high) && (arr[i] <= pivot)){
                i++;
            }
            while(j > low && arr[j] > pivot ){
                j--;
            }
            if(i>=j)
                break;
            swap(arr, i, j);
        }
        swap(arr,low, j);

        return j;
    }

    public static void swap(double[] arr, int i, int j ){
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Override
    public double[] sort(double[] arr) {
        int low = 0;
        int high = arr.length-1;

        randomizedQS(arr, low,high);

        return arr;
    }
}

