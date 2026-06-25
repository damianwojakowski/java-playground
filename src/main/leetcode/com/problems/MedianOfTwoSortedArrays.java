package leetcode.com.problems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = IntStream.concat(
                Arrays.stream(nums1),
                Arrays.stream(nums2)
        ).sorted().toArray();

        if (result.length % 2 == 0) {
            return (double) (result[result.length / 2] + result[(result.length / 2) - 1]) / 2;
        } else {
            return result[result.length / 2];
        }
    }
}
