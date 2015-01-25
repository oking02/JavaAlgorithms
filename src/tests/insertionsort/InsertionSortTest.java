package insertionsort;

import mergesort.MergeSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by oking on 25/01/15.
 */
public class InsertionSortTest {

    @Test
    public void testSort(){
        int[] toSort = new int[]{11,7,33,99, 16};
        int[] correctSort = new int[]{7,11, 16, 33, 99};

        InsertionSort insertionSort = new InsertionSort();
        int[] sorted = insertionSort.sort(toSort);

        assertTrue(Arrays.equals(correctSort, sorted));
    }

}
