import java.util.Arrays;
import java.util.Random;
public class CreateArray {


    public static double[] createArray(int size) {
        double[] arr = new double[size];
        Random rd = new Random();
        for(int i = 0; i < size; i++){
            arr[i] = rd.nextInt();
        }

        return arr;
    }
    public static void main(String[] args){
        CreateArray arr = new CreateArray();

    }
}
