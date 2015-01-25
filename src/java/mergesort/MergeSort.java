package mergesort;

import java.util.Arrays;

/**
 * Created by oking on 25/01/15.
 */
public class MergeSort {


    public int[] sort(int[] array){
        return mergeSort(array);
    }

    private int[] mergeSort(int[] toSort){
        if (toSort.length > 1){
            int m = toSort.length / 2;

            int[] rightArray = Arrays.copyOfRange(toSort, 0, m);
            int[] leftArray = Arrays.copyOfRange(toSort, m, toSort.length);

            mergeSort(rightArray);
            mergeSort(leftArray);

            merge(rightArray, leftArray, toSort);
        }
        return toSort;
    }

    private int[] merge(int[] left, int[] right, int[] resultArray){

        int leftPointer = 0;
        int rightPointer = 0;
        int counter = 0;

        while (leftPointer < left.length && rightPointer < right.length){

            if (left[leftPointer] < right[rightPointer]){
                resultArray[counter] = left[leftPointer];
                leftPointer++;
            } else {
                resultArray[counter] = right[rightPointer];
                rightPointer++;
            }
            counter++;
        }

        if (leftPointer < left.length){
            for (int i = leftPointer; i < left.length ; i++) {
                resultArray[counter] = left[leftPointer];
                leftPointer++;
                counter++;
            }
        }

        if (rightPointer < right.length){
            for (int i = rightPointer; i < right.length ; i++) {
                resultArray[counter] = right[rightPointer];
                rightPointer++;
                counter++;
            }
        }
        return resultArray;
    }

}
