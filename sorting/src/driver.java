public class driver {
    public static void main(String [] args){
        System.out.println("testing");

        /**
         * an array of the different array lengths that will be tested is created
         * and iterated through, testing the sorting algorithms for each
         */
        int[] arrayLengths = {50000, 100000, 150000,200000,250000,300000,350000,400000,450000,500000};
        for(int i = 0; i<arrayLengths.length;i++){
            testAlgos(arrayLengths[i]);
        }
    }

    public static void testAlgos(int sizeOf){
        System.out.println("#####"+sizeOf+"####");
        double [] array= CreateArray.createArray(sizeOf);
        Sort quickSort = new quicksort();
        long quickStartTime = System.currentTimeMillis();
        array = quickSort.sort(array);
        long quickEndTime = System.currentTimeMillis();

        System.out.println("Quicksort Run Time for array size "+array.length+": "+ (quickEndTime - quickStartTime) + " milliseconds.");

        array= CreateArray.createArray(sizeOf);
        Sort mergeSort = new mergesort();
        long mergeStartTime = System.currentTimeMillis();
        array = mergeSort.sort(array);
        long mergeEndTime = System.currentTimeMillis();

        System.out.println("Mergesort Run Time for array size "+array.length+": "+ (mergeEndTime - mergeStartTime) + " milliseconds.");

        array= CreateArray.createArray(sizeOf);
        Sort bubbleSort = new bubblesort();
        long bubbleStartTime = System.currentTimeMillis();
        bubbleSort.sort(array);
        long bubbleEndTime = System.currentTimeMillis();

        System.out.println("BubbleSort Run Time for array size "+array.length+": "+ (bubbleEndTime - bubbleStartTime) + " milliseconds.");

        array= CreateArray.createArray(sizeOf);
        Sort insertionSort = new insertionsort();
        long insertionStartTime = System.currentTimeMillis();
        insertionSort.sort(array);
        long insertionEndTime = System.currentTimeMillis();

        System.out.println("InsertionSort Run Time for array size "+array.length+": "+ (insertionEndTime - insertionStartTime) + " milliseconds.");

        array= CreateArray.createArray(50000);
        Sort selectionSort = new selectionsort();
        long selectionStartTime = System.currentTimeMillis();
        selectionSort.sort(array);
        long selectionEndTime = System.currentTimeMillis();

        System.out.println("SelectionSort Run Time for array size "+array.length+": "+ (selectionEndTime - selectionStartTime) + " milliseconds.");
    }
}
