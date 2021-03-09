import java.util.Arrays;

public class mergesort implements Sort {

    public mergesort() {
    }

    public void mergeSort(double[] array) {

        if (array.length > 1) {
            double[] left = get_left(array);
            double[] right = get_right(array);

            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }
    }
    public double[] get_left(double[] array) {
        int size = array.length / 2;
        double[] left = new double[size];
        for (int i = 0; i < size; i++) {
            left[i] = array[i];
        }
        return left;
    }

    public double[] get_right(double[] array) {
        int size;
        if(array.length % 2 != 0){
            size = (array.length/2) +1;
        }else{
            size = array.length/2;
        }

        double[] right = new double[size];

        int mid = (array.length / 2);
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }
        return right;
    }


    private void merge(double[] array, double[] left, double[] right) { // L- 1    R- 10
        int i = 0, j = 0, index = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j])
                array[index++] = left[i++];
            else
                array[index++] = right[j++];
        }
        while (j < right.length) {
            array[index++] = right[j++];
        }
        while (i < left.length) {
            array[index++] = left[i++];
        }

    }

    @Override
    public double[] sort(double[] arr) {

        mergeSort(arr);
        //System.out.println("Current time in milliseconds: " + System.currentTimeMillis());
        //System.out.println(Arrays.toString(arr));

        return arr;
    }
}
