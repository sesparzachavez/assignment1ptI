import java.util.Arrays;
public class insertionsort implements Sort{



    public insertionsort() {

    }

    public double[] sort(double[] arr){
        for(int i = 1; i < arr.length; i++){
            double temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = temp;
        }
        return arr;
    }

}
