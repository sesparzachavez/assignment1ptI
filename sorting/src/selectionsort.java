import java.util.Arrays;

public class selectionsort  implements Sort{

    CreateArray array;

    public selectionsort(CreateArray array) {
        this.array = array;
    }

    public double[] sort(double[] arr){
        for(int i = 0; i < arr.length -0;i++){
            swap(arr, i, findSmallest(arr,i));
        }
        return arr;
    }

    public static int findSmallest(double[] arr, int start){
        int smallest = start;
        for(int i = start+1; i < arr.length; i++){
            if(arr[i] < arr[smallest]){
                smallest = i;
            }
        }
        return smallest;
    }

    public static void swap(double[] arr, int i, int j ){
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
