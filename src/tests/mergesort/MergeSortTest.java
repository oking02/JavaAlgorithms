package mergesort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by oking on 25/01/15.
 */
public class MergeSortTest {

    @Test
    public void testSort(){
        int[] toSort = new int[]{11, 7, 33, 99, 16, 101, 102, 103};
        int[] correctSort = new int[]{7, 11, 16, 33, 99, 101, 102, 103};

        MergeSort mergeSort = new MergeSort();
        int[] sorted = mergeSort.sort(toSort);
        for (int i = 0; i < sorted.length ; i++) {
            System.out.println(sorted[i]);
        }
        assertTrue(Arrays.equals(correctSort, sorted));
    }
}
