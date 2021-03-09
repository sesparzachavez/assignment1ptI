public class bubblesort implements Sort {

    public bubblesort() {
    }

    public double[] sort(double[] arr){

        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }
    public static void swap(double[] arr, int i, int j ){
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
