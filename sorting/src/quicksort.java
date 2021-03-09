
public class quicksort implements Sort{

    public quicksort() {
    }

    public static void quicksort(double [] arr, int low, int high){
        if(low < high){
            int j = partition(arr, low,high);
            quicksort(arr,low, j-1);
            quicksort(arr, j+1, high);
        }
    }

    public static int partition(double[] arr, int low, int high){
        double pivot = arr[low];
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

        quicksort(arr, low,high);

        return arr;
    }
}
