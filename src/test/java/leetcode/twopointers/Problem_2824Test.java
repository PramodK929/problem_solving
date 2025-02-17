package leetcode.twopointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class Problem_2824Test {

    @Test
    void countPairsTestWithPositiveFlow() {
        // When
        List<Integer> nums = Arrays.asList(-1,1,2,3,1);
        int target = 2;
        // Then
        int actual = Problem_2824.countPairs(nums, target);
        int expected = 3;
        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void countPairsTestWithPositiveFlow2() {
        // When
        List<Integer> nums = Arrays.asList(-6,2,5,-2,-7,-1,3);
        int target = -2;
        // Then
        int actual = Problem_2824.countPairs(nums, target);
        int expected = 10;
        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void countPairsTestWithMaxArrayLength() {
        // When
        List<Integer> nums = Arrays.asList(27,12,-50,-34,-16,-43,-21,2,-7,49,33,25,48,9,21,44,34,-16,-5,2,6,-12,-46,30,-17,-5,0,-49,-48,-40,30,-22,-17,3,-26,2,15,-13,39,0,11,23,8,-47,43,-47,-13,-3,-41,20);
        int target = 10;
        // Then
        int actual = Problem_2824.countPairs(nums, target);
        int expected = 768;
        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void countPairsTestWithMaxArrayLength2() {
        // When
        List<Integer> nums = Arrays.asList(27,12,-50,-34,-16,-43,-21,2,-7,49,33,25,48,9,21,44,34,-16,-5,2,6,-12,-46,30,-17,-5,0,-49,-48,-40,30,-22,-17,3,-26,2,15,-13,39,0,11,23,8,-47,43,-47,-13,-3,-41,20);
        int target = 25;
        // Then
        int actual = Problem_2824.countPairs(nums, target);
        int expected = 909;
        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void countPairsTestWithMaxArrayLength3() {
        // When
        List<Integer> nums = Arrays.asList(27,12,-50,-34,-16,-43,-21,2,-7,49,33,25,48,9,21,44,34,-16,-5,2,6,-12,-46,30,-17,-5,0,-49,-48,-40,30,-22,-17,3,-26,2,15,-13,39,0,11,23,8,-47,43,-47,-13,-3,-41,20);
        int target = 4;
        // Then
        int actual = Problem_2824.countPairs(nums, target);
        int expected = 699;
        //Assert
        Assertions.assertEquals(expected, actual);
    }

}