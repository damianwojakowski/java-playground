package leetcode.com.problems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MedianOfTwoSortedArraysTest {

    @Test
    void GivenTwoArrays_ReturnsMedian() {
        int[] array1 = new int[]{1,2};
        int[] array2 = new int[]{3};

        int expectedMedian = 2;

        assertEquals(expectedMedian, MedianOfTwoSortedArrays.findMedianSortedArrays(array1, array2));
    }
}