package leetcode.com.problems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MedianOfTwoSortedArraysTest {

    @Test
    void GivenTwoArraysWithOddNumberOfElements_ReturnsMedian() {
        int[] array1 = new int[]{1, 3};
        int[] array2 = new int[]{2};

        int expectedMedian = 2;

        assertEquals(expectedMedian, MedianOfTwoSortedArrays.findMedianSortedArrays(array1, array2));
    }

    @Test
    void GivenTwoArraysWithEvenNumberOfElements_ReturnsMedian() {
        int[] array1 = new int[]{1, 2};
        int[] array2 = new int[]{3, 4};

        double expectedMedian = 2.5;

        assertEquals(expectedMedian, MedianOfTwoSortedArrays.findMedianSortedArrays(array1, array2));
    }

    @Test
    void GivenTwoArraysWithRepeatingValues_ReturnsMedian() {
        int[] array1 = new int[]{2, 2, 2, 5, 5, 5};
        int[] array2 = new int[]{2, 6, 7};

        double expectedMedian = 5;

        assertEquals(expectedMedian, MedianOfTwoSortedArrays.findMedianSortedArrays(array1, array2));
    }

    @Test
    void GivenFirstEmptyArray_ReturnsMedian() {
        int[] array1 = new int[]{};
        int[] array2 = new int[]{1, 2, 3, 4};

        double expectedMedian = 2.5;

        assertEquals(expectedMedian, MedianOfTwoSortedArrays.findMedianSortedArrays(array1, array2));
    }

    @Test
    void GivenSecondEmptyArray_ReturnsMedian() {
        int[] array1 = new int[]{2};
        int[] array2 = new int[]{};

        double expectedMedian = 2;

        assertEquals(expectedMedian, MedianOfTwoSortedArrays.findMedianSortedArrays(array1, array2));
    }

    @Test
    void GivenArrayWithNegativeNumbers_ReturnsMedian() {
        int[] array1 = new int[]{1, 2};
        int[] array2 = new int[]{-1, 3};

        double expectedMedian = 1.5;

        assertEquals(expectedMedian, MedianOfTwoSortedArrays.findMedianSortedArrays(array1, array2));
    }
}