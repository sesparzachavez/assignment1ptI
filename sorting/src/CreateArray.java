import java.util.Random;
public class CreateArray {

    /**
     * creates and returns an array of random doubles depending on the size being passed in by the loop in the driver
     * @param size
     * @return
     */
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
