import com.sun.tools.javac.Main;

import java.lang.reflect.Array;
import java.util.Arrays;

// Write a program to find all pairs of integers whose sum is equal to a given number.
import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args) {
    int target = 10;
    int[] intArray = {1,2,3,4,5,6};
    twoSum(intArray, target);




    }

    public static int[] twoSum(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("no solution found");
    }
}
